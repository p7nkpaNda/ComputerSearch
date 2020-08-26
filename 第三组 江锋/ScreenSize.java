public enum ScreenSize {
    Small,Medium,Big,VeryBig;
    @Override
    public String toString(){
        switch (this){
            case Small:    return "11英寸及以下";
            case Medium:   return "11英寸到13英寸（包括13英寸）";
            case Big:    return "13英寸到15英寸（包括15英寸）";
            case VeryBig:    return "15英寸以上";
            default:        return "Unspecified";
        }
    }
}
