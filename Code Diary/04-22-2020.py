def string_reverser(our_string):
    new_string = ""

    # Iterate over old string
    for i in range(len(our_string)):
        # Grab the charecter from the back of the string and add them to the new string
        new_string += our_string[(len(our_string) - 1) - i]

    # Return our solution
    return new_string


def word_flipper(inp):

    words = inp.split(" ")
    ans = ""

    for i in words:
        ans += string_reverser(i)
        ans+= " "
    return ans.strip()


print ("Pass" if ('retaw' == word_flipper('water')) else "Fail")
print ("Pass" if ('sihT si na elpmaxe' == word_flipper('This is an example')) else "Fail")
print ("Pass" if ('sihT si eno llams pets rof ...' == word_flipper('This is one small step for ...')) else "Fail")
