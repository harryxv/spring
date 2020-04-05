public class Contact implements Comparable<Contact> {
    private Integer id;
    private String name;
    private String company;
    private String telephone;

    /**
     * update ID before persist
     *
     * @param name
     * @param company
     * @param telephone
     */
    public Contact(String name, String company, String telephone) {
        this.name = name;
        this.company = company;
        this.telephone = telephone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    //order by name+company+telepho
    @Override  //must be consistent with equals
    public int compareTo(Contact o) {
        return (this.getName() + this.getCompany() + this.getTelephone()).compareTo(o.getName() + o.getCompany() + o.getTelephone());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Contact)) {
            return false;
        }
        Contact that = (Contact) o;
        return (this.getCompany().equals(that.getCompany())) && (this.getName().equals(that.getName())) && (this.getTelephone().equals(that.getTelephone()));
    }

    @Override
    public int hashCode() {
        return (this.getName() + this.getCompany() + this.getTelephone()).hashCode();
    }
}
