 -- factorial 6 = 720
  product [1..6]
 
  foldl' (*) 1 [1..6]
 
  (!!6) $ scanl (*) 1 [1..]
 
  fix (\f n -> if n <= 0 then 1 else n * f (n-1)) 6
 
 
  -- powers of two sequence
  iterate (2*) 1
 
  fix ((1:) . map (2*))
 
  unfoldr (\z -> Just (z, 2*z)) 1
 
 
  -- fibonacci sequence
  unfoldr (\(a,b) -> Just (a,(b,a+b))) (0,1)
 
  fibs = 0 : 1 : zipWith (+) fibs (tail fibs)
 
  fib = 0 : scanl (+) 1 fib    -- also,  fix ((0:) . scanl (+) 1)
 
 
  -- pascal triangle
  pascal = iterate (\row -> zipWith (+) ([0] ++ row) (row ++ [0])) [1]
 
 
  -- prime numbers  
  primes = sieve [2..] where
           sieve (p:xs) = p : sieve [ n | n <- xs, n `mod` p > 0 ]
 
  unfoldr  sieve [2..] where 
           sieve (p:xs) = Just(p,   [ n | n <- xs, n `mod` p > 0 ])
 
  otherPrimes = nubBy (((>1).).gcd) [2..]
 
 
  -- or if you want to use the Sieve of Eratosthenes
  diff xl@(x:xs) yl@(y:ys) | x < y     = x:diff xs yl
                           | x > y     =   diff xl ys
                           | otherwise =   diff xs ys 
 
  eprimes = sieve [2..] where
            sieve (p:xs) = p : sieve (diff xs [p, p+p..]) 
 
  fix $ map head . scanl diff [2..] . map (\p -> [p, p+p..])
 
 
  -- postponed to squares for n^1.5- instead of n^2.0+
  peprimes = 2 : sieve [3..] [[p*p, p*p+p..] | p <- peprimes] where
                 sieve (x:xs) t@((q:cs):r)
                      | x < q = x : sieve xs t
                      | otherwise = sieve (diff xs cs) r
 
  -- tree-folded, ~n^1.2, w/ data-ordlist's Data.List.Ordered.unionAll
  2 : _Y((3:) . diff [5,7..] . unionAll . map (\p -> [p*p, p*p+p..])) 
 
  _Y g = g (_Y g)    -- non-sharing recursion prevents memory retention 
 
 
  -- Hamming numbers
  fix $ (1:) . foldr ($) [] . sequence [union . map (k*) | k <- [2,3,5]]
 
  h = 1 : foldr (\n s -> fix (merge s . map (n*) . (1:))) [] [2,3,5]
  --  h = 1 : fix (merge s3 . map (2*) . (1:)) where
  --                     s3 = fix (merge s5 . map (3*) . (1:))) where
  --                                     s5 = fix (map (5*) . (1:)))
 
  merge a@(x:xs) b@(y:ys) | x < y     = x : merge xs  b  -- merge assumes 
                       -- | x == y    = x : union xs ys  --  there's no dups
                          | otherwise = y : merge a  ys
  merge [] b = b  -- merge [] = \b -> b = id   -- (id .) = id
  merge a [] = a
 
 
  -- enumerating the rationals (see [1])
  rats :: [Rational]
  rats = iterate next 1 where
       next x = recip (fromInteger n+1-y) where (n,y) = properFraction x
 
  -- another way
  rats2 = fix ((1:) . (>>= \x -> [1+x, 1/(1+x)])) :: [Rational]
