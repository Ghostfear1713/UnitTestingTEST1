public class Customer {

    private String name;
    //Status staus = Status.CHILD;


    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    //name.isEmpty() - Tjekker om en String er tom. Den retuner 'true' hvis Stringen har en længde på 0, og false hvis
    //den har en længde større end 0
    public void setName(String name) {
        if (name == null || name.isEmpty() || !Character.isUpperCase(name.charAt(0))) {
            throw new IllegalArgumentException("Invalid name format");
        }
        //checks if the character c is a letter or not in name (aka no numbers allowed)
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException("Invalid name format");
            }
        }

        this.name = name;
    }

    private Status status;

    public void setStatus(Status status) {
        if (this.status == status) {
            System.out.println("Customer is already in this status. Status cannot be changed.");
        } else {
            this.status = status;
        }
    }

    public Status getStatus() {
        return status;
    }








}
