package com.rip.framework.mongodao;

import java.util.ArrayList;



public interface TechnologyManagementDao {

	String addProjectTechnologySpeck(String proTechnologySpeck ,String appName, String version);
        
        String updateProjectTechnologySpeck(String proTechnologySpeck ,String appName, String version);
        
        String deleetProjectTechnologySpeck(String proTechnologySpeck ,String appName, String version);
        
        String getProjectTechnologySpeck(String proTechnologySpeck ,String appName, String version);
        
        String introduceNewTechnology(String technology);
        
        String removeExsistingTechnology(String userName, String user);
        
        ArrayList getExsistingTechnologies();
        
        ArrayList getExsistingTechnologies(String catogery);
        
        String getExsistingTechnology(String technologyName);


}