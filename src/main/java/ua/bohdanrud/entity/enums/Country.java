package ua.bohdanrud.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Country {

	UKRAINE("UKRAINE"), USA("USA"), POLAND("POLAND"), GERMANY("GERMANY"), ANOTHER("ANOTHER");

	private String country;

}
