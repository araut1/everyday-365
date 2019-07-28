static int migratoryBirds(List<Integer> arr) {

        int[] count = new int[6];
        count[0] = 0;
        int ret =0;

        for (int i = 0; i < arr.size(); i++) {
            count[arr.get(i)]++;
        }

        int max = 0;

        for (int i = count.length - 1; i >= 0; i--) {

            if(count[i] >= max){
                max = count[i];
                ret = i;
            }

        }

        return ret;
    }
