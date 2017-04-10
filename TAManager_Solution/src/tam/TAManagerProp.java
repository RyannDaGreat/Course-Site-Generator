package tam;

/**
 * This enum provides a list of all the user interface
 * text that needs to be loaded from the XML properties
 * file. By simply changing the XML file we could initialize
 * this application such that all UI controls are provided
 * in another language.
 * 
 * @author Richard McKenna
 * @co-author Khurram Malik
 * @version 2.0 
 */
public enum TAManagerProp {
    // FOR SIMPLE OK/CANCEL DIALOG BOXES
    OK_PROMPT,
    CANCEL_PROMPT,
    
    // THESE ARE FOR TEXT PARTICULAR TO THE APP'S WORKSPACE CONTROLS
    TAS_HEADER_TEXT,
    NAME_COLUMN_TEXT,
    EMAIL_COLUMN_TEXT,
    NAME_PROMPT_TEXT,
    EMAIL_PROMPT_TEXT,
    START_HOUR_PROMPT_TEXT,
    END_HOUR_PROMPT_TEXT, 
    ADD_BUTTON_TEXT,
    CHANGE_TIME_BUTTON_TEXT, 
    UPDATE_TA_BUTTON_TEXT,
    CLEAR_BUTTON_TEXT,
    OFFICE_HOURS_SUBHEADER,
    OFFICE_HOURS_TABLE_HEADERS,
    DAYS_OF_WEEK,
    UPDATE_TIME_TITLE,
    UPDATE_TIME_MESSAGE,
    
    // THESE ARE FOR ERROR MESSAGES PARTICULAR TO THE APP
    MISSING_TA_NAME_TITLE,
    MISSING_TA_NAME_MESSAGE,
    MISSING_TA_EMAIL_TITLE,
    MISSING_TA_EMAIL_MESSAGE,
    TA_NAME_AND_EMAIL_NOT_UNIQUE_TITLE,
    TA_NAME_AND_EMAIL_NOT_UNIQUE_MESSAGE,
    INVALID_TA_EMAIL_TITLE,
    INVALID_TA_EMAIL_MESSAGE,
    NO_UPDATE_TITLE,
    NO_UPDATE_MESSAGE,
    INVALID_TIME_INPUT_TITLE,
    INVALID_TIME_INPUT_MESSAGE
    
}
