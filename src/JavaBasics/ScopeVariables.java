package JavaBasics;

public class ScopeVariables {
//      scope = visibility


//    package
//      class
//        method

//      Local Variable
//      Global Variable
//      Static Local Variable
//      Static Global Variable

//      Local variables declared not visible out scope of method

//      static variables cannot be created in method scope

    SubScopeVariables x = new SubScopeVariables();


    static class SubScopeVariables {
        private String a = "";

        public SubScopeVariables() {
        }
    }

}