package model;

public class GundamModel {
	/** タイトル */
	private String title;
	/** 機体モデル */
	private MobileSuitModel[] mobileSuitModel;
	/** パイロットモデル */
	private PilotModel[] pilotModel;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public MobileSuitModel[] getMobileSuitModel() {
		return mobileSuitModel;
	}
	public void setMobileSuitModel(MobileSuitModel[] mobileSuitModel) {
		this.mobileSuitModel = mobileSuitModel;
	}
	public PilotModel[] getPilotModel() {
		return pilotModel;
	}
	public void setPilotModel(PilotModel[] pilotModel) {
		this.pilotModel = pilotModel;
	}
}
