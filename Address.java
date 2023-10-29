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

    public void displayShortAddress()
    {
        System.out.println("Address: " + StreetNo + " " + Street + " " + "Street, " + "Brgy. " + Barangay + " " + City + " " + "City");
    }

    public void format2()
    {
        System.out.println("Address: " + HouseNo + " " + StreetNo + " " + Street + " " + "Street, " + "Brgy. " + Barangay + " " + City + " " + Province + " " + ZipCode + " ");
        
    }
    public void format3()
    {
        System.out.println("Address: " + StreetNo + " " + Street +  "" + "Street, " + City + " " + "City, " + ZipCode + " ");
        
    }
    public void format4()
    {
        System.out.println("Address: " + Street + " " + "Brgy. " + Barangay + " " + City + "City" + "St., " + ZipCode + " ");

    }

    public void displayAddress(int format)
    {
        if(format < 1 || format > 4)
        {
            System.out.println("Invalid address specified");
        }
        else
        {
            switch(format)  
            {
                case 1:
                displayShortAddress();
                break;

                case 2:
                format2();
                break;

                case 3:
                format3();
                break;
                
                case 4:
                format4();
                break;

            }
        }
    } 
}
