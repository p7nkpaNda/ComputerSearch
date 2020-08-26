public enum ComputerType {
    Laptop,Desktop,Server;
    @Override
    public String toString(){
        switch (this){
            case Laptop:    return "Laptop";
            case Desktop:   return "Desktop";
            case Server:    return "Server";
            default:        return "Unspecified";
        }
    }
}
