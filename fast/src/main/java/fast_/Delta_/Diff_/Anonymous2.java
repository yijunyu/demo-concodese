// automatically generated by the FlatBuffers compiler, do not modify

package fast_.Delta_.Diff_;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Anonymous2 extends Table {
  public static Anonymous2 getRootAsAnonymous2(ByteBuffer _bb) { return getRootAsAnonymous2(_bb, new Anonymous2()); }
  public static Anonymous2 getRootAsAnonymous2(ByteBuffer _bb, Anonymous2 obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Anonymous2 __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public Match match() { return match(new Match()); }
  public Match match(Match obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public Add add() { return add(new Add()); }
  public Add add(Add obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public Del del() { return del(new Del()); }
  public Del del(Del obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public Move move() { return move(new Move()); }
  public Move move(Move obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public Update update() { return update(new Update()); }
  public Update update(Update obj) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createAnonymous2(FlatBufferBuilder builder,
      int matchOffset,
      int addOffset,
      int delOffset,
      int moveOffset,
      int updateOffset) {
    builder.startObject(5);
    Anonymous2.addUpdate(builder, updateOffset);
    Anonymous2.addMove(builder, moveOffset);
    Anonymous2.addDel(builder, delOffset);
    Anonymous2.addAdd(builder, addOffset);
    Anonymous2.addMatch(builder, matchOffset);
    return Anonymous2.endAnonymous2(builder);
  }

  public static void startAnonymous2(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addMatch(FlatBufferBuilder builder, int matchOffset) { builder.addOffset(0, matchOffset, 0); }
  public static void addAdd(FlatBufferBuilder builder, int addOffset) { builder.addOffset(1, addOffset, 0); }
  public static void addDel(FlatBufferBuilder builder, int delOffset) { builder.addOffset(2, delOffset, 0); }
  public static void addMove(FlatBufferBuilder builder, int moveOffset) { builder.addOffset(3, moveOffset, 0); }
  public static void addUpdate(FlatBufferBuilder builder, int updateOffset) { builder.addOffset(4, updateOffset, 0); }
  public static int endAnonymous2(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
