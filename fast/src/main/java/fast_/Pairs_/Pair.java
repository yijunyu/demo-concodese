// automatically generated by the FlatBuffers compiler, do not modify

package fast_.Pairs_;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Pair extends Table {
  public static Pair getRootAsPair(ByteBuffer _bb) { return getRootAsPair(_bb, new Pair()); }
  public static Pair getRootAsPair(ByteBuffer _bb, Pair obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Pair __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public fast_.Pairs_.Pair_.Diff left() { return left(new fast_.Pairs_.Pair_.Diff()); }
  public fast_.Pairs_.Pair_.Diff left(fast_.Pairs_.Pair_.Diff obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public fast_.Pairs_.Pair_.Diff right() { return right(new fast_.Pairs_.Pair_.Diff()); }
  public fast_.Pairs_.Pair_.Diff right(fast_.Pairs_.Pair_.Diff obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public int type() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createPair(FlatBufferBuilder builder,
      int leftOffset,
      int rightOffset,
      int type) {
    builder.startObject(3);
    Pair.addType(builder, type);
    Pair.addRight(builder, rightOffset);
    Pair.addLeft(builder, leftOffset);
    return Pair.endPair(builder);
  }

  public static void startPair(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addLeft(FlatBufferBuilder builder, int leftOffset) { builder.addOffset(0, leftOffset, 0); }
  public static void addRight(FlatBufferBuilder builder, int rightOffset) { builder.addOffset(1, rightOffset, 0); }
  public static void addType(FlatBufferBuilder builder, int type) { builder.addInt(2, type, 0); }
  public static int endPair(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

