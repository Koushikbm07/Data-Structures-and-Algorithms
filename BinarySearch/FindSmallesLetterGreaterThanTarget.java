import java.sql.SQLOutput;

public class FindSmallesLetterGreaterThanTarget {


        public static void  main(String[] args){
            char []letters={'c','f','g'};

            char target='a';
            System.out.println("The Smallest Letter Greater than Target is "+ nextGreatestLetter(letters,target));
        }
        public static  char nextGreatestLetter(char[] letters, char target) {
            int start=0,end=letters.length-1;

            while(start<=end){
                int mid=start+(end-start)/2;
                if(target>=letters[mid]){
                    start=mid+1;
                }
                else if(target<letters[mid]){
                    end=mid-1;
                }

            }
            return letters[start % letters.length];
        }



}
