public class EstonianID implements PersonalCodeBehaviour{
    public String code;

    public EstonianID(String code){
        this.code = code;
    }

    @Override
    public String getGender(){
        /*
        int first = Character.getNumericValue(code.toCharArray()[0]);   //tochararray returns array
        if (first == 1 || first == 3 || first == 5){
            return "Male";

        } else if (first == 2 || first == 4 || first == 6){
            return "Female";

        }else{
            return null;
        }
        */

        int gender = Integer.parseInt(code.substring(0, 1));  //starts from 0 and gets from this position 1

        return gender % 2 == 0 ? "Female" : "Male";
    }

    @Override
    public int getFullYear(){
        String year = code.substring(1, 3);
        int first = Character.getNumericValue(code.toCharArray()[0]);

        if (first == 1 || first == 2)
            year = "18" + year;
        else if (first == 3 || first == 4)
            year = "19" + year;

        return Integer.parseInt(year);
    }
    
    @Override
    public String getDOB(){
        String dob = code.substring(5,7) + "." + code.substring(3,5) + "." + getFullYear();
        return dob;

    }
    @Override
    public int getMonth
}
