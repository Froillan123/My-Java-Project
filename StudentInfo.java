public class StudentInfo 
{
        private String IdNo;
        private int YearLevel;
        private String ContactNo;
        private String Email;
        private String Program;

        public StudentInfo(String IdNo, int YearLevel, String ContactNo, String Email,String Program)
        {
            this.IdNo = IdNo;
            this.YearLevel = YearLevel;
            this.ContactNo = ContactNo;
            this.Email = Email;
            this.Program = Program;
        }

        public String getIdNo()
        {
            return IdNo;
        }
        public int getYearLevel()
        {
            return YearLevel;
        }
        public String getContactNo()
        {
            return ContactNo;
        }
        public String getEmail()
        {
            return Email;
        }
        public String getProgram()
        {
            return Program;
        }
}
