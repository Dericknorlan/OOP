public class Jobdesc extends Persons {
    private String namaJobdesc;
    private String status;
    private String role;
    private String deadline;
    private String keterangan;

    public Jobdesc() {
    }

    public Jobdesc(String namaJobdesc, String status, String role, String deadline, String keterangan) {
        this.namaJobdesc = namaJobdesc;
        this.status = status;
        this.role = role;
        this.deadline = deadline;
        this.keterangan = keterangan;
    }

    public String getNamaJobdesc() {
        return this.namaJobdesc;
    }

    public void setNamaJobdesc(String namaJobdesc) {
        this.namaJobdesc = namaJobdesc;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void displayDetails() {
        System.out.println("Nama Jobdesc\t: " + this.namaJobdesc);
        System.out.println("Status\t\t: " + this.status);
        System.out.println("Role\t\t: " + this.role);
        System.out.println("Deadline\t: " + this.deadline);
        System.out.println("Keterangan\t: " + this.keterangan);
    }

    public void displayDetails(String namaVariabel) {
        switch (namaVariabel) {
            case "namaJobdesc":
                System.out.println("Nama Jobdesc\t: " + this.namaJobdesc);
            case "status":
                System.out.println("Status\t\t: " + this.status);
            case "role":
                System.out.println("Role\t\t: " + this.role);
            case "deadline":
                System.out.println("Deadline\t: " + this.deadline);
            case "keterangan":
                System.out.println("Keterangan\t: " + this.keterangan);
        }
    }
}
