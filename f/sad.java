
public class sad
{
    
    public sad()
    {
        
    }
    
    public boolean collision(g a, g b){
        for(int x1 = a.x; x1 <= a.x+a.xs; x1++)
          for(int y1 = a.y; y1 <= a.y+a.ys; y1++)
            for(int x2 = b.x; x2 <= b.x+b.xs; x2++)
              for(int y2 = b.y; y2 <= b.y+b.ys; y2++)
                if(x1 == x2 && y1 == y2){
                  return true;
                }
                  
        return false;}
}
