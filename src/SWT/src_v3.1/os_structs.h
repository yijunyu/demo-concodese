/*******************************************************************************
* Copyright (c) 2000, 2005 IBM Corporation and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     IBM Corporation - initial API and implementation
*******************************************************************************/

#include "os.h"

#ifndef NO_AEDesc
void cacheAEDescFields(JNIEnv *env, jobject lpObject);
AEDesc *getAEDescFields(JNIEnv *env, jobject lpObject, AEDesc *lpStruct);
void setAEDescFields(JNIEnv *env, jobject lpObject, AEDesc *lpStruct);
#define AEDesc_sizeof() sizeof(AEDesc)
#else
#define cacheAEDescFields(a,b)
#define getAEDescFields(a,b,c) NULL
#define setAEDescFields(a,b,c)
#define AEDesc_sizeof() 0
#endif

#ifndef NO_ATSLayoutRecord
void cacheATSLayoutRecordFields(JNIEnv *env, jobject lpObject);
ATSLayoutRecord *getATSLayoutRecordFields(JNIEnv *env, jobject lpObject, ATSLayoutRecord *lpStruct);
void setATSLayoutRecordFields(JNIEnv *env, jobject lpObject, ATSLayoutRecord *lpStruct);
#define ATSLayoutRecord_sizeof() sizeof(ATSLayoutRecord)
#else
#define cacheATSLayoutRecordFields(a,b)
#define getATSLayoutRecordFields(a,b,c) NULL
#define setATSLayoutRecordFields(a,b,c)
#define ATSLayoutRecord_sizeof() 0
#endif

#ifndef NO_ATSTrapezoid
void cacheATSTrapezoidFields(JNIEnv *env, jobject lpObject);
ATSTrapezoid *getATSTrapezoidFields(JNIEnv *env, jobject lpObject, ATSTrapezoid *lpStruct);
void setATSTrapezoidFields(JNIEnv *env, jobject lpObject, ATSTrapezoid *lpStruct);
#define ATSTrapezoid_sizeof() sizeof(ATSTrapezoid)
#else
#define cacheATSTrapezoidFields(a,b)
#define getATSTrapezoidFields(a,b,c) NULL
#define setATSTrapezoidFields(a,b,c)
#define ATSTrapezoid_sizeof() 0
#endif

#ifndef NO_ATSUCaret
void cacheATSUCaretFields(JNIEnv *env, jobject lpObject);
ATSUCaret *getATSUCaretFields(JNIEnv *env, jobject lpObject, ATSUCaret *lpStruct);
void setATSUCaretFields(JNIEnv *env, jobject lpObject, ATSUCaret *lpStruct);
#define ATSUCaret_sizeof() sizeof(ATSUCaret)
#else
#define cacheATSUCaretFields(a,b)
#define getATSUCaretFields(a,b,c) NULL
#define setATSUCaretFields(a,b,c)
#define ATSUCaret_sizeof() 0
#endif

#ifndef NO_ATSUTab
void cacheATSUTabFields(JNIEnv *env, jobject lpObject);
ATSUTab *getATSUTabFields(JNIEnv *env, jobject lpObject, ATSUTab *lpStruct);
void setATSUTabFields(JNIEnv *env, jobject lpObject, ATSUTab *lpStruct);
#define ATSUTab_sizeof() sizeof(ATSUTab)
#else
#define cacheATSUTabFields(a,b)
#define getATSUTabFields(a,b,c) NULL
#define setATSUTabFields(a,b,c)
#define ATSUTab_sizeof() 0
#endif

#ifndef NO_ATSUUnhighlightData
void cacheATSUUnhighlightDataFields(JNIEnv *env, jobject lpObject);
ATSUUnhighlightData *getATSUUnhighlightDataFields(JNIEnv *env, jobject lpObject, ATSUUnhighlightData *lpStruct);
void setATSUUnhighlightDataFields(JNIEnv *env, jobject lpObject, ATSUUnhighlightData *lpStruct);
#define ATSUUnhighlightData_sizeof() sizeof(ATSUUnhighlightData)
#else
#define cacheATSUUnhighlightDataFields(a,b)
#define getATSUUnhighlightDataFields(a,b,c) NULL
#define setATSUUnhighlightDataFields(a,b,c)
#define ATSUUnhighlightData_sizeof() 0
#endif

#ifndef NO_AlertStdCFStringAlertParamRec
void cacheAlertStdCFStringAlertParamRecFields(JNIEnv *env, jobject lpObject);
AlertStdCFStringAlertParamRec *getAlertStdCFStringAlertParamRecFields(JNIEnv *env, jobject lpObject, AlertStdCFStringAlertParamRec *lpStruct);
void setAlertStdCFStringAlertParamRecFields(JNIEnv *env, jobject lpObject, AlertStdCFStringAlertParamRec *lpStruct);
#define AlertStdCFStringAlertParamRec_sizeof() sizeof(AlertStdCFStringAlertParamRec)
#else
#define cacheAlertStdCFStringAlertParamRecFields(a,b)
#define getAlertStdCFStringAlertParamRecFields(a,b,c) NULL
#define setAlertStdCFStringAlertParamRecFields(a,b,c)
#define AlertStdCFStringAlertParamRec_sizeof() 0
#endif

#ifndef NO_BitMap
void cacheBitMapFields(JNIEnv *env, jobject lpObject);
BitMap *getBitMapFields(JNIEnv *env, jobject lpObject, BitMap *lpStruct);
void setBitMapFields(JNIEnv *env, jobject lpObject, BitMap *lpStruct);
#define BitMap_sizeof() sizeof(BitMap)
#else
#define cacheBitMapFields(a,b)
#define getBitMapFields(a,b,c) NULL
#define setBitMapFields(a,b,c)
#define BitMap_sizeof() 0
#endif

#ifndef NO_CFRange
void cacheCFRangeFields(JNIEnv *env, jobject lpObject);
CFRange *getCFRangeFields(JNIEnv *env, jobject lpObject, CFRange *lpStruct);
void setCFRangeFields(JNIEnv *env, jobject lpObject, CFRange *lpStruct);
#define CFRange_sizeof() sizeof(CFRange)
#else
#define cacheCFRangeFields(a,b)
#define getCFRangeFields(a,b,c) NULL
#define setCFRangeFields(a,b,c)
#define CFRange_sizeof() 0
#endif

#ifndef NO_CGFunctionCallbacks
void cacheCGFunctionCallbacksFields(JNIEnv *env, jobject lpObject);
CGFunctionCallbacks *getCGFunctionCallbacksFields(JNIEnv *env, jobject lpObject, CGFunctionCallbacks *lpStruct);
void setCGFunctionCallbacksFields(JNIEnv *env, jobject lpObject, CGFunctionCallbacks *lpStruct);
#define CGFunctionCallbacks_sizeof() sizeof(CGFunctionCallbacks)
#else
#define cacheCGFunctionCallbacksFields(a,b)
#define getCGFunctionCallbacksFields(a,b,c) NULL
#define setCGFunctionCallbacksFields(a,b,c)
#define CGFunctionCallbacks_sizeof() 0
#endif

#ifndef NO_CGPathElement
void cacheCGPathElementFields(JNIEnv *env, jobject lpObject);
CGPathElement *getCGPathElementFields(JNIEnv *env, jobject lpObject, CGPathElement *lpStruct);
void setCGPathElementFields(JNIEnv *env, jobject lpObject, CGPathElement *lpStruct);
#define CGPathElement_sizeof() sizeof(CGPathElement)
#else
#define cacheCGPathElementFields(a,b)
#define getCGPathElementFields(a,b,c) NULL
#define setCGPathElementFields(a,b,c)
#define CGPathElement_sizeof() 0
#endif

#ifndef NO_CGPatternCallbacks
void cacheCGPatternCallbacksFields(JNIEnv *env, jobject lpObject);
CGPatternCallbacks *getCGPatternCallbacksFields(JNIEnv *env, jobject lpObject, CGPatternCallbacks *lpStruct);
void setCGPatternCallbacksFields(JNIEnv *env, jobject lpObject, CGPatternCallbacks *lpStruct);
#define CGPatternCallbacks_sizeof() sizeof(CGPatternCallbacks)
#else
#define cacheCGPatternCallbacksFields(a,b)
#define getCGPatternCallbacksFields(a,b,c) NULL
#define setCGPatternCallbacksFields(a,b,c)
#define CGPatternCallbacks_sizeof() 0
#endif

#ifndef NO_CGPoint
void cacheCGPointFields(JNIEnv *env, jobject lpObject);
CGPoint *getCGPointFields(JNIEnv *env, jobject lpObject, CGPoint *lpStruct);
void setCGPointFields(JNIEnv *env, jobject lpObject, CGPoint *lpStruct);
#define CGPoint_sizeof() sizeof(CGPoint)
#else
#define cacheCGPointFields(a,b)
#define getCGPointFields(a,b,c) NULL
#define setCGPointFields(a,b,c)
#define CGPoint_sizeof() 0
#endif

#ifndef NO_CGRect
void cacheCGRectFields(JNIEnv *env, jobject lpObject);
CGRect *getCGRectFields(JNIEnv *env, jobject lpObject, CGRect *lpStruct);
void setCGRectFields(JNIEnv *env, jobject lpObject, CGRect *lpStruct);
#define CGRect_sizeof() sizeof(CGRect)
#else
#define cacheCGRectFields(a,b)
#define getCGRectFields(a,b,c) NULL
#define setCGRectFields(a,b,c)
#define CGRect_sizeof() 0
#endif

#ifndef NO_ColorPickerInfo
void cacheColorPickerInfoFields(JNIEnv *env, jobject lpObject);
ColorPickerInfo *getColorPickerInfoFields(JNIEnv *env, jobject lpObject, ColorPickerInfo *lpStruct);
void setColorPickerInfoFields(JNIEnv *env, jobject lpObject, ColorPickerInfo *lpStruct);
#define ColorPickerInfo_sizeof() sizeof(ColorPickerInfo)
#else
#define cacheColorPickerInfoFields(a,b)
#define getColorPickerInfoFields(a,b,c) NULL
#define setColorPickerInfoFields(a,b,c)
#define ColorPickerInfo_sizeof() 0
#endif

#ifndef NO_ControlButtonContentInfo
void cacheControlButtonContentInfoFields(JNIEnv *env, jobject lpObject);
ControlButtonContentInfo *getControlButtonContentInfoFields(JNIEnv *env, jobject lpObject, ControlButtonContentInfo *lpStruct);
void setControlButtonContentInfoFields(JNIEnv *env, jobject lpObject, ControlButtonContentInfo *lpStruct);
#define ControlButtonContentInfo_sizeof() sizeof(ControlButtonContentInfo)
#else
#define cacheControlButtonContentInfoFields(a,b)
#define getControlButtonContentInfoFields(a,b,c) NULL
#define setControlButtonContentInfoFields(a,b,c)
#define ControlButtonContentInfo_sizeof() 0
#endif

#ifndef NO_ControlFontStyleRec
void cacheControlFontStyleRecFields(JNIEnv *env, jobject lpObject);
ControlFontStyleRec *getControlFontStyleRecFields(JNIEnv *env, jobject lpObject, ControlFontStyleRec *lpStruct);
void setControlFontStyleRecFields(JNIEnv *env, jobject lpObject, ControlFontStyleRec *lpStruct);
#define ControlFontStyleRec_sizeof() sizeof(ControlFontStyleRec)
#else
#define cacheControlFontStyleRecFields(a,b)
#define getControlFontStyleRecFields(a,b,c) NULL
#define setControlFontStyleRecFields(a,b,c)
#define ControlFontStyleRec_sizeof() 0
#endif

#ifndef NO_ControlTabEntry
void cacheControlTabEntryFields(JNIEnv *env, jobject lpObject);
ControlTabEntry *getControlTabEntryFields(JNIEnv *env, jobject lpObject, ControlTabEntry *lpStruct);
void setControlTabEntryFields(JNIEnv *env, jobject lpObject, ControlTabEntry *lpStruct);
#define ControlTabEntry_sizeof() sizeof(ControlTabEntry)
#else
#define cacheControlTabEntryFields(a,b)
#define getControlTabEntryFields(a,b,c) NULL
#define setControlTabEntryFields(a,b,c)
#define ControlTabEntry_sizeof() 0
#endif

#ifndef NO_ControlTabInfoRecV1
void cacheControlTabInfoRecV1Fields(JNIEnv *env, jobject lpObject);
ControlTabInfoRecV1 *getControlTabInfoRecV1Fields(JNIEnv *env, jobject lpObject, ControlTabInfoRecV1 *lpStruct);
void setControlTabInfoRecV1Fields(JNIEnv *env, jobject lpObject, ControlTabInfoRecV1 *lpStruct);
#define ControlTabInfoRecV1_sizeof() sizeof(ControlTabInfoRecV1)
#else
#define cacheControlTabInfoRecV1Fields(a,b)
#define getControlTabInfoRecV1Fields(a,b,c) NULL
#define setControlTabInfoRecV1Fields(a,b,c)
#define ControlTabInfoRecV1_sizeof() 0
#endif

#ifndef NO_Cursor
void cacheCursorFields(JNIEnv *env, jobject lpObject);
Cursor *getCursorFields(JNIEnv *env, jobject lpObject, Cursor *lpStruct);
void setCursorFields(JNIEnv *env, jobject lpObject, Cursor *lpStruct);
#define Cursor_sizeof() sizeof(Cursor)
#else
#define cacheCursorFields(a,b)
#define getCursorFields(a,b,c) NULL
#define setCursorFields(a,b,c)
#define Cursor_sizeof() 0
#endif

#ifndef NO_DataBrowserCallbacks
void cacheDataBrowserCallbacksFields(JNIEnv *env, jobject lpObject);
DataBrowserCallbacks *getDataBrowserCallbacksFields(JNIEnv *env, jobject lpObject, DataBrowserCallbacks *lpStruct);
void setDataBrowserCallbacksFields(JNIEnv *env, jobject lpObject, DataBrowserCallbacks *lpStruct);
#define DataBrowserCallbacks_sizeof() sizeof(DataBrowserCallbacks)
#else
#define cacheDataBrowserCallbacksFields(a,b)
#define getDataBrowserCallbacksFields(a,b,c) NULL
#define setDataBrowserCallbacksFields(a,b,c)
#define DataBrowserCallbacks_sizeof() 0
#endif

#ifndef NO_DataBrowserCustomCallbacks
void cacheDataBrowserCustomCallbacksFields(JNIEnv *env, jobject lpObject);
DataBrowserCustomCallbacks *getDataBrowserCustomCallbacksFields(JNIEnv *env, jobject lpObject, DataBrowserCustomCallbacks *lpStruct);
void setDataBrowserCustomCallbacksFields(JNIEnv *env, jobject lpObject, DataBrowserCustomCallbacks *lpStruct);
#define DataBrowserCustomCallbacks_sizeof() sizeof(DataBrowserCustomCallbacks)
#else
#define cacheDataBrowserCustomCallbacksFields(a,b)
#define getDataBrowserCustomCallbacksFields(a,b,c) NULL
#define setDataBrowserCustomCallbacksFields(a,b,c)
#define DataBrowserCustomCallbacks_sizeof() 0
#endif

#ifndef NO_DataBrowserListViewColumnDesc
void cacheDataBrowserListViewColumnDescFields(JNIEnv *env, jobject lpObject);
DataBrowserListViewColumnDesc *getDataBrowserListViewColumnDescFields(JNIEnv *env, jobject lpObject, DataBrowserListViewColumnDesc *lpStruct);
void setDataBrowserListViewColumnDescFields(JNIEnv *env, jobject lpObject, DataBrowserListViewColumnDesc *lpStruct);
#define DataBrowserListViewColumnDesc_sizeof() sizeof(DataBrowserListViewColumnDesc)
#else
#define cacheDataBrowserListViewColumnDescFields(a,b)
#define getDataBrowserListViewColumnDescFields(a,b,c) NULL
#define setDataBrowserListViewColumnDescFields(a,b,c)
#define DataBrowserListViewColumnDesc_sizeof() 0
#endif

#ifndef NO_DataBrowserListViewHeaderDesc
void cacheDataBrowserListViewHeaderDescFields(JNIEnv *env, jobject lpObject);
DataBrowserListViewHeaderDesc *getDataBrowserListViewHeaderDescFields(JNIEnv *env, jobject lpObject, DataBrowserListViewHeaderDesc *lpStruct);
void setDataBrowserListViewHeaderDescFields(JNIEnv *env, jobject lpObject, DataBrowserListViewHeaderDesc *lpStruct);
#define DataBrowserListViewHeaderDesc_sizeof() sizeof(DataBrowserListViewHeaderDesc)
#else
#define cacheDataBrowserListViewHeaderDescFields(a,b)
#define getDataBrowserListViewHeaderDescFields(a,b,c) NULL
#define setDataBrowserListViewHeaderDescFields(a,b,c)
#define DataBrowserListViewHeaderDesc_sizeof() 0
#endif

#ifndef NO_EventRecord
void cacheEventRecordFields(JNIEnv *env, jobject lpObject);
EventRecord *getEventRecordFields(JNIEnv *env, jobject lpObject, EventRecord *lpStruct);
void setEventRecordFields(JNIEnv *env, jobject lpObject, EventRecord *lpStruct);
#define EventRecord_sizeof() sizeof(EventRecord)
#else
#define cacheEventRecordFields(a,b)
#define getEventRecordFields(a,b,c) NULL
#define setEventRecordFields(a,b,c)
#define EventRecord_sizeof() 0
#endif

#ifndef NO_FontInfo
void cacheFontInfoFields(JNIEnv *env, jobject lpObject);
FontInfo *getFontInfoFields(JNIEnv *env, jobject lpObject, FontInfo *lpStruct);
void setFontInfoFields(JNIEnv *env, jobject lpObject, FontInfo *lpStruct);
#define FontInfo_sizeof() sizeof(FontInfo)
#else
#define cacheFontInfoFields(a,b)
#define getFontInfoFields(a,b,c) NULL
#define setFontInfoFields(a,b,c)
#define FontInfo_sizeof() 0
#endif

#ifndef NO_FontSelectionQDStyle
void cacheFontSelectionQDStyleFields(JNIEnv *env, jobject lpObject);
FontSelectionQDStyle *getFontSelectionQDStyleFields(JNIEnv *env, jobject lpObject, FontSelectionQDStyle *lpStruct);
void setFontSelectionQDStyleFields(JNIEnv *env, jobject lpObject, FontSelectionQDStyle *lpStruct);
#define FontSelectionQDStyle_sizeof() sizeof(FontSelectionQDStyle)
#else
#define cacheFontSelectionQDStyleFields(a,b)
#define getFontSelectionQDStyleFields(a,b,c) NULL
#define setFontSelectionQDStyleFields(a,b,c)
#define FontSelectionQDStyle_sizeof() 0
#endif

#ifndef NO_GDevice
void cacheGDeviceFields(JNIEnv *env, jobject lpObject);
GDevice *getGDeviceFields(JNIEnv *env, jobject lpObject, GDevice *lpStruct);
void setGDeviceFields(JNIEnv *env, jobject lpObject, GDevice *lpStruct);
#define GDevice_sizeof() sizeof(GDevice)
#else
#define cacheGDeviceFields(a,b)
#define getGDeviceFields(a,b,c) NULL
#define setGDeviceFields(a,b,c)
#define GDevice_sizeof() 0
#endif

#ifndef NO_HICommand
void cacheHICommandFields(JNIEnv *env, jobject lpObject);
HICommand *getHICommandFields(JNIEnv *env, jobject lpObject, HICommand *lpStruct);
void setHICommandFields(JNIEnv *env, jobject lpObject, HICommand *lpStruct);
#define HICommand_sizeof() sizeof(HICommand)
#else
#define cacheHICommandFields(a,b)
#define getHICommandFields(a,b,c) NULL
#define setHICommandFields(a,b,c)
#define HICommand_sizeof() 0
#endif

#ifndef NO_HMHelpContentRec
void cacheHMHelpContentRecFields(JNIEnv *env, jobject lpObject);
HMHelpContentRec *getHMHelpContentRecFields(JNIEnv *env, jobject lpObject, HMHelpContentRec *lpStruct);
void setHMHelpContentRecFields(JNIEnv *env, jobject lpObject, HMHelpContentRec *lpStruct);
#define HMHelpContentRec_sizeof() sizeof(HMHelpContentRec)
#else
#define cacheHMHelpContentRecFields(a,b)
#define getHMHelpContentRecFields(a,b,c) NULL
#define setHMHelpContentRecFields(a,b,c)
#define HMHelpContentRec_sizeof() 0
#endif

#ifndef NO_MenuTrackingData
void cacheMenuTrackingDataFields(JNIEnv *env, jobject lpObject);
MenuTrackingData *getMenuTrackingDataFields(JNIEnv *env, jobject lpObject, MenuTrackingData *lpStruct);
void setMenuTrackingDataFields(JNIEnv *env, jobject lpObject, MenuTrackingData *lpStruct);
#define MenuTrackingData_sizeof() sizeof(MenuTrackingData)
#else
#define cacheMenuTrackingDataFields(a,b)
#define getMenuTrackingDataFields(a,b,c) NULL
#define setMenuTrackingDataFields(a,b,c)
#define MenuTrackingData_sizeof() 0
#endif

#ifndef NO_NavDialogCreationOptions
void cacheNavDialogCreationOptionsFields(JNIEnv *env, jobject lpObject);
NavDialogCreationOptions *getNavDialogCreationOptionsFields(JNIEnv *env, jobject lpObject, NavDialogCreationOptions *lpStruct);
void setNavDialogCreationOptionsFields(JNIEnv *env, jobject lpObject, NavDialogCreationOptions *lpStruct);
#define NavDialogCreationOptions_sizeof() sizeof(NavDialogCreationOptions)
#else
#define cacheNavDialogCreationOptionsFields(a,b)
#define getNavDialogCreationOptionsFields(a,b,c) NULL
#define setNavDialogCreationOptionsFields(a,b,c)
#define NavDialogCreationOptions_sizeof() 0
#endif

#ifndef NO_NavReplyRecord
void cacheNavReplyRecordFields(JNIEnv *env, jobject lpObject);
NavReplyRecord *getNavReplyRecordFields(JNIEnv *env, jobject lpObject, NavReplyRecord *lpStruct);
void setNavReplyRecordFields(JNIEnv *env, jobject lpObject, NavReplyRecord *lpStruct);
#define NavReplyRecord_sizeof() sizeof(NavReplyRecord)
#else
#define cacheNavReplyRecordFields(a,b)
#define getNavReplyRecordFields(a,b,c) NULL
#define setNavReplyRecordFields(a,b,c)
#define NavReplyRecord_sizeof() 0
#endif

#ifndef NO_PMRect
void cachePMRectFields(JNIEnv *env, jobject lpObject);
PMRect *getPMRectFields(JNIEnv *env, jobject lpObject, PMRect *lpStruct);
void setPMRectFields(JNIEnv *env, jobject lpObject, PMRect *lpStruct);
#define PMRect_sizeof() sizeof(PMRect)
#else
#define cachePMRectFields(a,b)
#define getPMRectFields(a,b,c) NULL
#define setPMRectFields(a,b,c)
#define PMRect_sizeof() 0
#endif

#ifndef NO_PMResolution
void cachePMResolutionFields(JNIEnv *env, jobject lpObject);
PMResolution *getPMResolutionFields(JNIEnv *env, jobject lpObject, PMResolution *lpStruct);
void setPMResolutionFields(JNIEnv *env, jobject lpObject, PMResolution *lpStruct);
#define PMResolution_sizeof() sizeof(PMResolution)
#else
#define cachePMResolutionFields(a,b)
#define getPMResolutionFields(a,b,c) NULL
#define setPMResolutionFields(a,b,c)
#define PMResolution_sizeof() 0
#endif

#ifndef NO_PixMap
void cachePixMapFields(JNIEnv *env, jobject lpObject);
PixMap *getPixMapFields(JNIEnv *env, jobject lpObject, PixMap *lpStruct);
void setPixMapFields(JNIEnv *env, jobject lpObject, PixMap *lpStruct);
#define PixMap_sizeof() sizeof(PixMap)
#else
#define cachePixMapFields(a,b)
#define getPixMapFields(a,b,c) NULL
#define setPixMapFields(a,b,c)
#define PixMap_sizeof() 0
#endif

#ifndef NO_Point
void cachePointFields(JNIEnv *env, jobject lpObject);
Point *getPointFields(JNIEnv *env, jobject lpObject, Point *lpStruct);
void setPointFields(JNIEnv *env, jobject lpObject, Point *lpStruct);
#define Point_sizeof() sizeof(Point)
#else
#define cachePointFields(a,b)
#define getPointFields(a,b,c) NULL
#define setPointFields(a,b,c)
#define Point_sizeof() 0
#endif

#ifndef NO_RGBColor
void cacheRGBColorFields(JNIEnv *env, jobject lpObject);
RGBColor *getRGBColorFields(JNIEnv *env, jobject lpObject, RGBColor *lpStruct);
void setRGBColorFields(JNIEnv *env, jobject lpObject, RGBColor *lpStruct);
#define RGBColor_sizeof() sizeof(RGBColor)
#else
#define cacheRGBColorFields(a,b)
#define getRGBColorFields(a,b,c) NULL
#define setRGBColorFields(a,b,c)
#define RGBColor_sizeof() 0
#endif

#ifndef NO_Rect
void cacheRectFields(JNIEnv *env, jobject lpObject);
Rect *getRectFields(JNIEnv *env, jobject lpObject, Rect *lpStruct);
void setRectFields(JNIEnv *env, jobject lpObject, Rect *lpStruct);
#define Rect_sizeof() sizeof(Rect)
#else
#define cacheRectFields(a,b)
#define getRectFields(a,b,c) NULL
#define setRectFields(a,b,c)
#define Rect_sizeof() 0
#endif

#ifndef NO_TXNBackground
void cacheTXNBackgroundFields(JNIEnv *env, jobject lpObject);
TXNBackground *getTXNBackgroundFields(JNIEnv *env, jobject lpObject, TXNBackground *lpStruct);
void setTXNBackgroundFields(JNIEnv *env, jobject lpObject, TXNBackground *lpStruct);
#define TXNBackground_sizeof() sizeof(TXNBackground)
#else
#define cacheTXNBackgroundFields(a,b)
#define getTXNBackgroundFields(a,b,c) NULL
#define setTXNBackgroundFields(a,b,c)
#define TXNBackground_sizeof() 0
#endif

#ifndef NO_TXNLongRect
void cacheTXNLongRectFields(JNIEnv *env, jobject lpObject);
TXNLongRect *getTXNLongRectFields(JNIEnv *env, jobject lpObject, TXNLongRect *lpStruct);
void setTXNLongRectFields(JNIEnv *env, jobject lpObject, TXNLongRect *lpStruct);
#define TXNLongRect_sizeof() sizeof(TXNLongRect)
#else
#define cacheTXNLongRectFields(a,b)
#define getTXNLongRectFields(a,b,c) NULL
#define setTXNLongRectFields(a,b,c)
#define TXNLongRect_sizeof() 0
#endif

#ifndef NO_ThemeButtonDrawInfo
void cacheThemeButtonDrawInfoFields(JNIEnv *env, jobject lpObject);
ThemeButtonDrawInfo *getThemeButtonDrawInfoFields(JNIEnv *env, jobject lpObject, ThemeButtonDrawInfo *lpStruct);
void setThemeButtonDrawInfoFields(JNIEnv *env, jobject lpObject, ThemeButtonDrawInfo *lpStruct);
#define ThemeButtonDrawInfo_sizeof() sizeof(ThemeButtonDrawInfo)
#else
#define cacheThemeButtonDrawInfoFields(a,b)
#define getThemeButtonDrawInfoFields(a,b,c) NULL
#define setThemeButtonDrawInfoFields(a,b,c)
#define ThemeButtonDrawInfo_sizeof() 0
#endif

