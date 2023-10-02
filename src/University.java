public class University {
    private Lab[] labs;

    public void addLab(Lab lab) {

        if (labs == null) {
            labs = new Lab[5];
            labs[0] = lab;
        } else {
            for (int i = 0; i < labs.length; i++) {
                if (labs[i] == null) {
                    labs[i] = lab;
                    break;
                }
            }
        }
    }

    public void removeLab(String labID) {
        for (int i = 0; i < labs.length; i++) {
            if (labs[i] != null && labs[i].equals(labID)) {
                labs[i] = null;
                break;
            }
        }
    }

    public Lab fetchLab(String labID) {
        for (Lab lab : labs) {
            if (lab != null && lab.equals(labID)) {
                return lab;
            }
        }
        return null;
    }


    public void fetchLabDetails(String labID) {
        for (Lab lab : labs) {
            if (lab != null && lab.equals(labID)) {
                lab.displayDetails();
                break;
            }
        }
    }

    public void fetchComputerDetails(String labID, String computerNumber) {
        for (Lab lab : labs) {
            if (lab != null && lab.equals(labID)) {
                Computer computer = lab.fetchComputer(computerNumber);
                if (computer != null) {
                    computer.displayDetails();
                } else {
                    System.out.println("Computer not found in the  lab.");
                }
                break;
            }
        }
    }
}
