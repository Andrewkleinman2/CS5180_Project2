public class inlinks {

	public void fillInlinks(website[] webs) {
		int i = 0;
		while(i<webs.length) {
			for(int j = 0;j<webs.outlinks;j++) {
				webs.outlinks[j].inlinks.add(webs[i]);
			}
			i++;
		}
	}
}
