package utility;
import model.*;
public  class CheckBlogPost  extends  OffensiveWordsChecker implements OffensiveWordsInterface{
	@Override
	public boolean checkBlog(Blog blog)
	{	 
		String blogTitle=blog.getBlogTitle();
		String blogDescription=blog.getBlogDescription();
		LocalDate date=blog.getDate();
		if(checkBlogTitle(Blog blog) &&checkBlogDescription(Blog blog))
			return true;
			else
				return false;
	}	
	private boolean checkBlogTitle(Blog blog){
		int count=0;
		String bad[25]=["2 girls 1 cup","2g1c","4r5e","5h1t","5hit","a$$","a$$hole","a_s_s","a2m","a54","a55","a55hole","acrotomophilia","aeolus","ahole","alabama hot pocket","alaskan pipeline","anal","anal impaler","anal leakage","analprobe","anilingus","anus","apeshit","ar5e"];
		String blogTitle=blog.getBlogTitle();
		for(int i=0;i<25;i++){
			if(bad[i].equals(blogTitle))
				return false;
			else
				count++;
			if(count==25)
				return true;
		}
	}
	private boolean checkBlogDescription(Blog blog){
		int count=0;
		String bad[25]=["2 girls 1 cup","2g1c","4r5e","5h1t","5hit","a$$","a$$hole","a_s_s","a2m","a54","a55","a55hole","acrotomophilia","aeolus","ahole","alabama hot pocket","alaskan pipeline","anal","anal impaler","anal leakage","analprobe","anilingus","anus","apeshit","ar5e"];
		String blogDescription=blog.getBlogDescription()
		for(int i=0;i<25;i++){
			if(bad[i].equals(blogDescription))
				return false;
			else
				count++;
			if(count==25)
				return true;
		}
	}
}