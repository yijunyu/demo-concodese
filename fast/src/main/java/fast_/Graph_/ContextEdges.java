// automatically generated by the FlatBuffers compiler, do not modify

package fast_.Graph_;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ContextEdges extends Table {
  public static ContextEdges getRootAsContextEdges(ByteBuffer _bb) { return getRootAsContextEdges(_bb, new ContextEdges()); }
  public static ContextEdges getRootAsContextEdges(ByteBuffer _bb, ContextEdges obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public ContextEdges __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public Edge nextToken(int j) { return nextToken(new Edge(), j); }
  public Edge nextToken(Edge obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int nextTokenLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public Edge child(int j) { return child(new Edge(), j); }
  public Edge child(Edge obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int childLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public Edge lastLexicalUse(int j) { return lastLexicalUse(new Edge(), j); }
  public Edge lastLexicalUse(Edge obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int lastLexicalUseLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public Edge lastUse(int j) { return lastUse(new Edge(), j); }
  public Edge lastUse(Edge obj, int j) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int lastUseLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public Edge lastWrite(int j) { return lastWrite(new Edge(), j); }
  public Edge lastWrite(Edge obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int lastWriteLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public Edge returnsTo(int j) { return returnsTo(new Edge(), j); }
  public Edge returnsTo(Edge obj, int j) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int returnsToLength() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }
  public Edge computesFrom(int j) { return computesFrom(new Edge(), j); }
  public Edge computesFrom(Edge obj, int j) { int o = __offset(16); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int computesFromLength() { int o = __offset(16); return o != 0 ? __vector_len(o) : 0; }

  public static int createContextEdges(FlatBufferBuilder builder,
      int nextTokenOffset,
      int childOffset,
      int lastLexicalUseOffset,
      int lastUseOffset,
      int lastWriteOffset,
      int returnsToOffset,
      int computesFromOffset) {
    builder.startObject(7);
    ContextEdges.addComputesFrom(builder, computesFromOffset);
    ContextEdges.addReturnsTo(builder, returnsToOffset);
    ContextEdges.addLastWrite(builder, lastWriteOffset);
    ContextEdges.addLastUse(builder, lastUseOffset);
    ContextEdges.addLastLexicalUse(builder, lastLexicalUseOffset);
    ContextEdges.addChild(builder, childOffset);
    ContextEdges.addNextToken(builder, nextTokenOffset);
    return ContextEdges.endContextEdges(builder);
  }

  public static void startContextEdges(FlatBufferBuilder builder) { builder.startObject(7); }
  public static void addNextToken(FlatBufferBuilder builder, int nextTokenOffset) { builder.addOffset(0, nextTokenOffset, 0); }
  public static int createNextTokenVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startNextTokenVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addChild(FlatBufferBuilder builder, int childOffset) { builder.addOffset(1, childOffset, 0); }
  public static int createChildVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startChildVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addLastLexicalUse(FlatBufferBuilder builder, int lastLexicalUseOffset) { builder.addOffset(2, lastLexicalUseOffset, 0); }
  public static int createLastLexicalUseVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startLastLexicalUseVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addLastUse(FlatBufferBuilder builder, int lastUseOffset) { builder.addOffset(3, lastUseOffset, 0); }
  public static int createLastUseVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startLastUseVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addLastWrite(FlatBufferBuilder builder, int lastWriteOffset) { builder.addOffset(4, lastWriteOffset, 0); }
  public static int createLastWriteVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startLastWriteVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addReturnsTo(FlatBufferBuilder builder, int returnsToOffset) { builder.addOffset(5, returnsToOffset, 0); }
  public static int createReturnsToVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startReturnsToVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addComputesFrom(FlatBufferBuilder builder, int computesFromOffset) { builder.addOffset(6, computesFromOffset, 0); }
  public static int createComputesFromVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startComputesFromVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endContextEdges(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
