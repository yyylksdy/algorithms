   public static String findEnbededString(String[] words, String p) {

        String result = "";

        HashMap<Character, Integer> freqW = new HashMap<>();

        HashMap<Character, Integer> freP = new HashMap<>();

        for(int i = 0; i < p.length(); i++) {

            char c = p.charAt(i);

            freP.put(c, freP.getOrDefault(c, 0)+1);

        }

        for(int i = 0; i < words.length; i++) {

            String word = words[i];

            for(int j = 0; j < word.length(); j++) {

                freqW.put(word.charAt(j), freqW.getOrDefault(word.charAt(j), 0) +1);

                Integer countW = freqW.get(word.charAt(j));

                Integer countP = freP.get(word.charAt(j));

                if(countW != null && countP != null) {

                    if(countW > 0 && countP > 0) {

                        result += String.valueOf(word.charAt(j));

                        if(result.length() == word.length()) {

                            return result;

                        }

                    }

                }

            }

        }

        System.out.println(freP.toString());

        System.out.println(freqW.toString());

       

        return result;

    }