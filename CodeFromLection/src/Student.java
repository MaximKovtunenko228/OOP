public class Student {
    private String name;
    Account account;

    public Student(String name, String password) {
        this.name = name;
        account = new Account(password);
    }
    public void displayStudent() {
        System.out.println("Student - " + name + "Password " + account.password);
    }
    public class Account {
        private String password;
        Account(String pass) {
            this.password = pass;
        }
        void displayAccount() {
            System.out.println("Account Login: " + Student.this.name + "Password: " + password);

        }
    }
}
