public class Main {

    public static void main(String[] args) {

        BaseCrediManager[] crediManagers = new BaseCrediManager[]
                {new FarmsCredi(),new StudentCredi(),new TeacherCredi()};

        for(BaseCrediManager crediManager: crediManagers){
            System.out.println(crediManager.calculator(1000));
        }
    }
}
