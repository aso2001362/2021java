import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    System.out.println("*******************************");
    System.out.println("          戦艦ゲーム            ");
    System.out.println("*******************************");

    //配列の初期化・船の初期位置
    int[][] position = new int[5][5];
    for(int i=1; i<6; i++){
        for(int j=1;j<6; j++){
            position[i][j]=0;
        }
    }
    
    Ship ship1 = new Ship();
    position[ship1.x][ship1.y]=1;
    
    Ship ship2 = new Ship();
    while(ship1.x == ship2.x && ship1.y == ship2.y){
             ship2.x = new java.util.Random().nextInt(5)+1;
             ship2.y = new java.util.Random().nextInt(5)+1;
     }
     position[ship2.x][ship2.y]=1;
    
    Ship ship3 = new Ship();
    while((ship1.x == ship3.x && ship1.y == ship3.y) || 
        (ship2.x == ship3.x && ship2.y == ship3.y)){
        ship3.x = new java.util.Random().nextInt(5)+1;
        ship3.y = new java.util.Random().nextInt(5)+1;
        }
    position[ship3.x][ship3.y]=1;

    //爆弾投下位置設定
    int bombX=0;
    int bombY=0;


    bombX=insertX();
    bombY=insertY();
    
    result(ship1.hp,ship2.hp,ship3.hp,bombX,bombY);
    
    }

    public static int insertX(){
    Scanner sc = new Scanner(System.in);
    System.out.println("爆弾を投下する横方向の位置を入力してください");
    int bombX = sc.nextInt();
    sc.close();
    return bombX;
    }

    public static int insertY(){
    Scanner sc = new Scanner(System.in);   
    System.out.println("爆弾を投下する縦方向の位置を入力してください");
    int bombY = sc.nextInt();
    sc.close();
    return bombY;
    }

    public static void result(int ship1,int ship2,int ship3,int bombX,int bombY){
        while(ship1==0&&ship2==0&&ship3==0){
            if()
        }
    }
}