public enum SubType {
    Game,Frivolous,WaterCooling,GamingScreen,Tower,Rack;
    @Override
    public String toString(){
        switch (this){
            case Game:    return "游戏本";
            case Frivolous:   return "轻薄本";
            case WaterCooling:    return "水冷";
            case GamingScreen:    return "电竞屏";
            case Tower:    return "塔架式";
            case Rack:    return "机架式";
            default:        return "Unspecified";
        }
    }
}
