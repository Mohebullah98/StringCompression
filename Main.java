class Main {
  public static String compression(String s){
    StringBuilder compressed = new StringBuilder();
    int count=0;
    char current=s.charAt(0);
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)==current){
        count+=1;//increase count for current character
      }
      else{//if new char, then add previous char + count
        compressed.append(current);
        compressed.append(count);
        count =1;
        current=s.charAt(i);//set new count and current char
      }
      if(i+1==s.length()){//append last character when reached end of string
        compressed.append(current);
        compressed.append(count);
      }
    }
    //return the shorter string
    return s.length()<compressed.length()? s:compressed.toString();
  }
  public static void main(String[] args) {
    String example = "aaabccdeee";
    String ex2 = "abcd";
    System.out.println(compression(example));//should print compressed string
    System.out.print(compression(ex2));//should print original string because it will be shorter than compressed
  }
}