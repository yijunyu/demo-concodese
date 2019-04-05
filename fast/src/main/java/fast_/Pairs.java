// automatically generated by the FlatBuffers compiler, do not modify

package fast_;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Pairs extends Table {
  public static Pairs getRootAsPairs(ByteBuffer _bb) { return getRootAsPairs(_bb, new Pairs()); }
  public static Pairs getRootAsPairs(ByteBuffer _bb, Pairs obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Pairs __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public fast_.Pairs_.Pair pair(int j) { return pair(new fast_.Pairs_.Pair(), j); }
  public fast_.Pairs_.Pair pair(fast_.Pairs_.Pair obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int pairLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }

  public static int createPairs(FlatBufferBuilder builder,
      int pairOffset) {
    builder.startObject(1);
    Pairs.addPair(builder, pairOffset);
    return Pairs.endPairs(builder);
  }

  public static void startPairs(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addPair(FlatBufferBuilder builder, int pairOffset) { builder.addOffset(0, pairOffset, 0); }
  public static int createPairVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startPairVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endPairs(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
