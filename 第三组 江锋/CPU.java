public enum CPU {
    Intel_i9,intel_CoreM,AMD,Ryzen7,Ryzen5;
    @Override
    public String toString(){
        switch (this){
            case Intel_i9:    return "Intel_i9";
            case intel_CoreM:   return "intel_CoreM";
            case AMD:    return "AMD";
            case Ryzen7:    return "Ryzen7";
            case Ryzen5:    return "Ryzen5";
            default:        return "Unspecified";
        }
    }
}
