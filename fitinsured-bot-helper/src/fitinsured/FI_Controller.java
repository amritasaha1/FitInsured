package fitinsured;

import java.util.Map;

import org.json.JSONObject;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FI_Controller implements RequestHandler<Map<String,String>, String>{
  Gson gson = new GsonBuilder().setPrettyPrinting().create();
  @Override
  public String handleRequest(Map<String,String> policyType, Context context)
  {
    LambdaLogger logger = context.getLogger();
    String response = new String("Sure, let us ask few more questions to get you right kind of policy");
    logger.log("This message is coming from java layer");
    // log execution details
    logger.log("ENVIRONMENT VARIABLES: " + gson.toJson(System.getenv()));
    logger.log("CONTEXT: " + gson.toJson(context));
    JSONObject item = new JSONObject();
    item.put("name", "filename.java");
    item.put("filepath","aimaginarypath");
    return String.valueOf(item);
  }
}
