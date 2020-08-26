public enum Brand {
    Lenovo,ThinkPad,HUAWEI,XIAOMI,DELL;

    @Override
    public String toString() {
        switch (this){
            case Lenovo:    return "Lenovo";
            case ThinkPad:   return "ThinkPad";
            case HUAWEI:    return "HUAWEI";
            case XIAOMI:    return "XIAOMI";
            case DELL:      return "DELL";
            default:        return "Unspecified";
        }
    }
}
