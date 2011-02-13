package tv.porst.swfretools.parser.structures;

import tv.porst.splib.binaryparser.Flag;
import tv.porst.splib.binaryparser.UBits;

/**
 * Represents an EndShape structure.
 * 
 * @author sp
 *
 */
public final class EndShapeRecord implements ShapeRecord, Shape3Record, IFileElement {

	/**
	 * Type flag.
	 */
	private final Flag typeFlag;

	/**
	 * End of shape flag.
	 */
	private final UBits endOfShape;

	/**
	 * Creates a new FocalGradient object.
	 * 
	 * @param typeFlag Type flag.
	 * @param endOfShape End of shape flag.
	 */
	public EndShapeRecord(final Flag typeFlag, final UBits endOfShape) {

		this.typeFlag = typeFlag;
		this.endOfShape = endOfShape;
	}

	@Override
	public int getBytePosition() {
		return typeFlag.getBytePosition();
	}

	/**
	 * Returns the End of shape flag.
	 *
	 * @return The End of shape flag.
	 */
	public UBits getEndOfShape() {
		return endOfShape;
	}

	/**
	 * Returns the type flag.
	 *
	 * @return The type flag.
	 */
	public Flag getTypeFlag() {
		return typeFlag;
	}
}