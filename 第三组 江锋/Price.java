public enum Price {
    Cheap,Medium,Expensive,Luxury;
    @Override
    public String toString(){
        switch (this){
            case Cheap:    return "0-3999";
            case Medium:   return "4000-5999";
            case Expensive:    return "6000-7999";
            case Luxury:    return "8000以上";
            default:        return "Unspecified";
        }
    }

}
