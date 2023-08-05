public class Marks {
    public char grade(int grade)
    {
        if(grade < 0)
        {
            throw new IllegalArgumentException("number Not found ");
        }
        else if(grade < 40)
        {      return 'f';
    }
        else if(grade < 60)
        {
            return 'd';
        }
        else if(grade < 70)
        {
            return 'c';
        }
        else if (grade < 90)
        {
        return 'b';
        }
        else 
        {
  return 'a';

        }
    }

    // //main 
    // public static void main(String[] args) {
    //     Marks m= new Marks();
    //     char ans = m.grade(90);
    //     System.out.println(ans);
    // }

    
}
