// automatically generated by the FlatBuffers compiler, do not modify

package fast_.Element_;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Unit extends Table {
  public static Unit getRootAsUnit(ByteBuffer _bb) { return getRootAsUnit(_bb, new Unit()); }
  public static Unit getRootAsUnit(ByteBuffer _bb, Unit obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Unit __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String filename() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer filenameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer filenameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String revision() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer revisionAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer revisionInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public int language() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int item() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createUnit(FlatBufferBuilder builder,
      int filenameOffset,
      int revisionOffset,
      int language,
      int item) {
    builder.startObject(4);
    Unit.addItem(builder, item);
    Unit.addLanguage(builder, language);
    Unit.addRevision(builder, revisionOffset);
    Unit.addFilename(builder, filenameOffset);
    return Unit.endUnit(builder);
  }

  public static void startUnit(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addFilename(FlatBufferBuilder builder, int filenameOffset) { builder.addOffset(0, filenameOffset, 0); }
  public static void addRevision(FlatBufferBuilder builder, int revisionOffset) { builder.addOffset(1, revisionOffset, 0); }
  public static void addLanguage(FlatBufferBuilder builder, int language) { builder.addInt(2, language, 0); }
  public static void addItem(FlatBufferBuilder builder, int item) { builder.addInt(3, item, 0); }
  public static int endUnit(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
