package mixpowder.weekscheduler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class TimeTableJson{

	private List<Integer> time = new ArrayList<Integer>();
	private List<String> className = new ArrayList<String>();
	private List<String> memo = new ArrayList<String>();
	private int size;

	public TimeTableJson(){
		File file = new File("timetable.json");
		String json = "",str;
		JsonArray objs = null;

		try {
			if(!file.exists())file.createNewFile();
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((str = br.readLine()) != null){
				json = json + str;
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
		JsonParser parser = new JsonParser();
        objs = parser.parse(json).getAsJsonArray();
        size = objs.size();
        for(int i = 0; i < size; i++){
        	time.add(objs.get(i).getAsJsonObject().get("time").getAsInt());
        	className.add(objs.get(i).getAsJsonObject().get("className").getAsString());
        	memo.add(objs.get(i).getAsJsonObject().get("memo").getAsString());
        }
	}

	public List<Integer> getTime(){
		return time;
	}

	public List<String> getClassName(){
		return className;
	}

	public List<String> getMemo(){
		return memo;
	}

	public int getSize(){
		return size;
	}
}