public class Address 
{
    private String HouseNo;
    private String StreetNo;
    private String Street;
    private String Barangay;
    private String City;
    private String Province;
    private String ZipCode;

    public Address(String HouseNo, String StreetNo, String Street, String Barangay, String City, String Province, String ZipCode)
    {
        this.HouseNo = HouseNo;
        this.StreetNo = StreetNo;
        this.Street = Street;
        this.Barangay = Barangay;
        this.City = City;
        this.Province = Province;
        this.ZipCode = ZipCode;
    }

    public String displayShortAddress() {
        return "Address: " + StreetNo + " " + Street + " " + "Street, " + "Brgy. " + Barangay + " " + City + " " + "City";
    }

    public String format2() {
        return "Address: " + HouseNo + " " + StreetNo + " " + Street + " " + "Street, " + "Brgy. " + Barangay + " " + City + " " + Province + " " + ZipCode + " ";
    }

    public String format3() {
        return "Address: " + StreetNo + " " + Street + " " + "Street, " + City + " " + "City, " + ZipCode + " ";
    }

    public String format4() {
        return "Address: " + Street + " " + "Brgy. " + Barangay + " " + City + "City" + "St., " + ZipCode + " ";
    }

    public String getAddressString(int format) {
        switch (format) {
            case 1:
                return displayShortAddress();
            case 2:
                return format2();
            case 3:
                return format3();
            case 4:
                return format4();
            default:
                return "Invalid address specified";
        }
    }
}
