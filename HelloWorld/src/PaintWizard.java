public class PaintWizard {
    Paint paint;
    int roomSizeM2;


    public String paintWasted(Paint paint, int roomSizeM2){

        int paintCoverSize = paint.coverSizeM2*paint.coverSizeM2;
        int paintRoomSize = roomSizeM2*roomSizeM2;

        int cansNeeded = (paintRoomSize/paintCoverSize)+1;
        int paintWaste = (cansNeeded*paintCoverSize)- paintRoomSize;
        double totalCost = cansNeeded*paint.price;

        double totalWaste = (double)(paintCoverSize*cansNeeded)-paintRoomSize;
        double wastePerc = (totalWaste/(double)paintCoverSize)*100;

        double wasteCost = (wastePerc/100)*(double)paint.price;
        double wasteVol = (wastePerc/100)*(double)paint.volume;

        return cansNeeded + " can(s) needed @ £" + totalCost + " and " + Math.round(wastePerc*100.0)/100.0 + "% (£"+ Math.round(wasteCost*100.0)/100.0 +" / "+Math.round(wasteVol*100.0)/100.0+"litre(s)) wasted ";


    }




}
