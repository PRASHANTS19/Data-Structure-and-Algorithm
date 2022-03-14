class Solution {
	public String simplifyPath(String path) {
		if(path.length() >=1 && path.length() <= 3000 ) {
			String[] tokens = path.split("/|\\s+");
			Stack<String> simplifiedPath = new Stack<>();
			for (String str : tokens) {
				if(str.equals("..") ) {
					if(!simplifiedPath.isEmpty())
						simplifiedPath.pop();

				} else if(!str.isEmpty() && !str.equals(".")){
					simplifiedPath.push(str);
				}
			}
			if(simplifiedPath.isEmpty()) return "/";

			StringBuilder sb = new StringBuilder();
			for(String str : simplifiedPath) {
				sb.append("/");
				sb.append(str);
			}
			return sb.toString();
		} else {
			//usually throw an error string is too long, but here return null should suffice
			return null;
		}
	}
}