public class First {
    public static void main(String[] args) {
        import xlrd
                workbook = xlrd.open_workbook("E:\DATA\data1.xlsx")
        worksheet=workbook.sheet_by_index(0)
        xsum=0;
        ysum=0;
        mol=0;
        denx=0;
        deny=0;

        for i in range(10):
        xsum=xsum+x(i);
        ysum=ysum+y(i);

        xmean=xsum/10;
        ymean=ysum/10;

        for i in range(10):
        mol=mol+(x(i)-xmean)*(y(i)-ymean);
        denx=denx+(x(i)-xmean)^2;
        deny=deny+(y(i)-ymean)^2;

        r=mol/(sqrt(denx)*sqrt(deny));
    }
}
