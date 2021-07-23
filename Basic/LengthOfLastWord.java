

class LengthOfLastWord {


// RT: 0ms 100% /MU 37 87.7%

    public int lengthOfLastWord(String s) {


        int i=s.length();
        int index=0;

        while(i > 0)

            if (s.charAt(--i) != ' '){
                index++;
            }else if (index>0) {
                return index;
            }

            return index;
        }


        public static void main(String[] args) {

            LengthOfLastWord obj=new LengthOfLastWord();
            System.out.println(obj.lengthOfLastWord(sentence));

        }

    }