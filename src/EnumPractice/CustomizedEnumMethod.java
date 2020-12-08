package EnumPractice;

public enum CustomizedEnumMethod {
    Debajyoti,Ranganath,Arnab{
        public String show(){
            return "It is Arnab specific method";
        }
    },Kunal;
    public String show(){
        return "It is a generic method";
    }
}
