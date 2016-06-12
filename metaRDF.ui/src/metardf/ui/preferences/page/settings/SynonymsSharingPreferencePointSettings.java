package metardf.ui.preferences.page.settings;

import metardf.core.extensions.preferences.IPointSettings;

public class SynonymsSharingPreferencePointSettings implements IPointSettings {
	public static String NAME = "Synonyms sharing between senses";
	
	public static int RELEVANCE_OF_SYNONYMS = 10; // hasta 10
	public static int RELEVANCE_OF_PATHS = 10; // hasta 10
	public static int RELEVANCE_OF_DEFINITIONS = 5; // hasta 10
	public static int RELEVANCE_OF_USAGES = 5; // hasta 10
	public static int RELEVANCE_OF_INFORMATION_SHARING = 100; // hasta 100
	
	public static int MAX_WEIGHT = 50;
	
	
	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getRelevanceOfSynonyms() {
		return RELEVANCE_OF_SYNONYMS;
	}

	@Override
	public int getRelevanceOfPaths() {
		return RELEVANCE_OF_PATHS;
	}

	@Override
	public int getRelevanceOfDefinitions() {
		return RELEVANCE_OF_DEFINITIONS;
	}

	@Override
	public int getRelevanceOfUsages() {
		return RELEVANCE_OF_USAGES;
	}

	@Override
	public int getRelevanceOfInformationSharing() {
		return RELEVANCE_OF_INFORMATION_SHARING;
	}

	@Override
	public int getMaxWeight() {
		return MAX_WEIGHT;
	}

}