// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ScenePointUnlockNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ScenePointUnlockNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ScenePointUnlockNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ScenePointUnlockNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ScenePointUnlockNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cScenePointUnlockNotify.proto\"\u008d\u0001\n\u0016ScenePointUnlockNotify\u0012\u0012\n\npoint_list\u0018\r \u0003(\r\u0012\u0010\n\bscene_id\u0018\u0006 \u0001(\r\u0012\u0019\n\u0011unhide_point_list\u0018\f \u0003(\r\u0012\u0017\n\u000fhide_point_list\u0018\u0001 \u0003(\r\u0012\u0019\n\u0011locked_point_list\u0018\b \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ScenePointUnlockNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ScenePointUnlockNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ScenePointUnlockNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ScenePointUnlockNotifyOuterClass.internal_static_ScenePointUnlockNotify_descriptor, new String[] { "PointList", "SceneId", "UnhidePointList", "HidePointList", "LockedPointList" });
    }
    
    public static final class ScenePointUnlockNotify extends GeneratedMessageV3 implements ScenePointUnlockNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int POINT_LIST_FIELD_NUMBER = 13;
        private Internal.IntList pointList_;
        private int pointListMemoizedSerializedSize;
        public static final int SCENE_ID_FIELD_NUMBER = 6;
        private int sceneId_;
        public static final int UNHIDE_POINT_LIST_FIELD_NUMBER = 12;
        private Internal.IntList unhidePointList_;
        private int unhidePointListMemoizedSerializedSize;
        public static final int HIDE_POINT_LIST_FIELD_NUMBER = 1;
        private Internal.IntList hidePointList_;
        private int hidePointListMemoizedSerializedSize;
        public static final int LOCKED_POINT_LIST_FIELD_NUMBER = 8;
        private Internal.IntList lockedPointList_;
        private int lockedPointListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final ScenePointUnlockNotify DEFAULT_INSTANCE;
        private static final Parser<ScenePointUnlockNotify> PARSER;
        
        private ScenePointUnlockNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.pointListMemoizedSerializedSize = -1;
            this.unhidePointListMemoizedSerializedSize = -1;
            this.hidePointListMemoizedSerializedSize = -1;
            this.lockedPointListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ScenePointUnlockNotify() {
            this.pointListMemoizedSerializedSize = -1;
            this.unhidePointListMemoizedSerializedSize = -1;
            this.hidePointListMemoizedSerializedSize = -1;
            this.lockedPointListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.pointList_ = GeneratedMessageV3.emptyIntList();
            this.unhidePointList_ = GeneratedMessageV3.emptyIntList();
            this.hidePointList_ = GeneratedMessageV3.emptyIntList();
            this.lockedPointList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ScenePointUnlockNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ScenePointUnlockNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.hidePointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.hidePointList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x4) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.hidePointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.hidePointList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 48: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.lockedPointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.lockedPointList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 66: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x8) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.lockedPointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x8;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.lockedPointList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 96: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.unhidePointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.unhidePointList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unhidePointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unhidePointList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 104: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.pointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.pointList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 106: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.pointList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.pointList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.hidePointList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.lockedPointList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.unhidePointList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.pointList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ScenePointUnlockNotifyOuterClass.internal_static_ScenePointUnlockNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ScenePointUnlockNotifyOuterClass.internal_static_ScenePointUnlockNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ScenePointUnlockNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getPointListList() {
            return this.pointList_;
        }
        
        @Override
        public int getPointListCount() {
            return this.pointList_.size();
        }
        
        @Override
        public int getPointList(final int index) {
            return this.pointList_.getInt(index);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public List<Integer> getUnhidePointListList() {
            return this.unhidePointList_;
        }
        
        @Override
        public int getUnhidePointListCount() {
            return this.unhidePointList_.size();
        }
        
        @Override
        public int getUnhidePointList(final int index) {
            return this.unhidePointList_.getInt(index);
        }
        
        @Override
        public List<Integer> getHidePointListList() {
            return this.hidePointList_;
        }
        
        @Override
        public int getHidePointListCount() {
            return this.hidePointList_.size();
        }
        
        @Override
        public int getHidePointList(final int index) {
            return this.hidePointList_.getInt(index);
        }
        
        @Override
        public List<Integer> getLockedPointListList() {
            return this.lockedPointList_;
        }
        
        @Override
        public int getLockedPointListCount() {
            return this.lockedPointList_.size();
        }
        
        @Override
        public int getLockedPointList(final int index) {
            return this.lockedPointList_.getInt(index);
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            this.getSerializedSize();
            if (this.getHidePointListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.hidePointListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.hidePointList_.size(); ++i) {
                output.writeUInt32NoTag(this.hidePointList_.getInt(i));
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(6, this.sceneId_);
            }
            if (this.getLockedPointListList().size() > 0) {
                output.writeUInt32NoTag(66);
                output.writeUInt32NoTag(this.lockedPointListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.lockedPointList_.size(); ++i) {
                output.writeUInt32NoTag(this.lockedPointList_.getInt(i));
            }
            if (this.getUnhidePointListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.unhidePointListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unhidePointList_.size(); ++i) {
                output.writeUInt32NoTag(this.unhidePointList_.getInt(i));
            }
            if (this.getPointListList().size() > 0) {
                output.writeUInt32NoTag(106);
                output.writeUInt32NoTag(this.pointListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.pointList_.size(); ++i) {
                output.writeUInt32NoTag(this.pointList_.getInt(i));
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            int dataSize = 0;
            for (int i = 0; i < this.hidePointList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.hidePointList_.getInt(i));
            }
            size += dataSize;
            if (!this.getHidePointListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.hidePointListMemoizedSerializedSize = dataSize;
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.sceneId_);
            }
            dataSize = 0;
            for (int i = 0; i < this.lockedPointList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.lockedPointList_.getInt(i));
            }
            size += dataSize;
            if (!this.getLockedPointListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.lockedPointListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.unhidePointList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unhidePointList_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnhidePointListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unhidePointListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.pointList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.pointList_.getInt(i));
            }
            size += dataSize;
            if (!this.getPointListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.pointListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScenePointUnlockNotify)) {
                return super.equals(obj);
            }
            final ScenePointUnlockNotify other = (ScenePointUnlockNotify)obj;
            return this.getPointListList().equals(other.getPointListList()) && this.getSceneId() == other.getSceneId() && this.getUnhidePointListList().equals(other.getUnhidePointListList()) && this.getHidePointListList().equals(other.getHidePointListList()) && this.getLockedPointListList().equals(other.getLockedPointListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getPointListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getPointListList().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getSceneId();
            if (this.getUnhidePointListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getUnhidePointListList().hashCode();
            }
            if (this.getHidePointListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getHidePointListList().hashCode();
            }
            if (this.getLockedPointListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getLockedPointListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ScenePointUnlockNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ScenePointUnlockNotify.PARSER.parseFrom(data);
        }
        
        public static ScenePointUnlockNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScenePointUnlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScenePointUnlockNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ScenePointUnlockNotify.PARSER.parseFrom(data);
        }
        
        public static ScenePointUnlockNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScenePointUnlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScenePointUnlockNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ScenePointUnlockNotify.PARSER.parseFrom(data);
        }
        
        public static ScenePointUnlockNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScenePointUnlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScenePointUnlockNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePointUnlockNotify.PARSER, input);
        }
        
        public static ScenePointUnlockNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePointUnlockNotify.PARSER, input, extensionRegistry);
        }
        
        public static ScenePointUnlockNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ScenePointUnlockNotify.PARSER, input);
        }
        
        public static ScenePointUnlockNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ScenePointUnlockNotify.PARSER, input, extensionRegistry);
        }
        
        public static ScenePointUnlockNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePointUnlockNotify.PARSER, input);
        }
        
        public static ScenePointUnlockNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePointUnlockNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ScenePointUnlockNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ScenePointUnlockNotify prototype) {
            return ScenePointUnlockNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ScenePointUnlockNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ScenePointUnlockNotify getDefaultInstance() {
            return ScenePointUnlockNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ScenePointUnlockNotify> parser() {
            return ScenePointUnlockNotify.PARSER;
        }
        
        @Override
        public Parser<ScenePointUnlockNotify> getParserForType() {
            return ScenePointUnlockNotify.PARSER;
        }
        
        @Override
        public ScenePointUnlockNotify getDefaultInstanceForType() {
            return ScenePointUnlockNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ScenePointUnlockNotify();
            PARSER = new AbstractParser<ScenePointUnlockNotify>() {
                @Override
                public ScenePointUnlockNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ScenePointUnlockNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ScenePointUnlockNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList pointList_;
            private int sceneId_;
            private Internal.IntList unhidePointList_;
            private Internal.IntList hidePointList_;
            private Internal.IntList lockedPointList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ScenePointUnlockNotifyOuterClass.internal_static_ScenePointUnlockNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ScenePointUnlockNotifyOuterClass.internal_static_ScenePointUnlockNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ScenePointUnlockNotify.class, Builder.class);
            }
            
            private Builder() {
                this.pointList_ = GeneratedMessageV3.emptyIntList();
                this.unhidePointList_ = GeneratedMessageV3.emptyIntList();
                this.hidePointList_ = GeneratedMessageV3.emptyIntList();
                this.lockedPointList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.pointList_ = GeneratedMessageV3.emptyIntList();
                this.unhidePointList_ = GeneratedMessageV3.emptyIntList();
                this.hidePointList_ = GeneratedMessageV3.emptyIntList();
                this.lockedPointList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ScenePointUnlockNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.pointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.sceneId_ = 0;
                this.unhidePointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.hidePointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.lockedPointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ScenePointUnlockNotifyOuterClass.internal_static_ScenePointUnlockNotify_descriptor;
            }
            
            @Override
            public ScenePointUnlockNotify getDefaultInstanceForType() {
                return ScenePointUnlockNotify.getDefaultInstance();
            }
            
            @Override
            public ScenePointUnlockNotify build() {
                final ScenePointUnlockNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ScenePointUnlockNotify buildPartial() {
                final ScenePointUnlockNotify result = new ScenePointUnlockNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.pointList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.pointList_ = this.pointList_;
                result.sceneId_ = this.sceneId_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.unhidePointList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.unhidePointList_ = this.unhidePointList_;
                if ((this.bitField0_ & 0x4) != 0x0) {
                    this.hidePointList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.hidePointList_ = this.hidePointList_;
                if ((this.bitField0_ & 0x8) != 0x0) {
                    this.lockedPointList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                result.lockedPointList_ = this.lockedPointList_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof ScenePointUnlockNotify) {
                    return this.mergeFrom((ScenePointUnlockNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ScenePointUnlockNotify other) {
                if (other == ScenePointUnlockNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.pointList_.isEmpty()) {
                    if (this.pointList_.isEmpty()) {
                        this.pointList_ = other.pointList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensurePointListIsMutable();
                        this.pointList_.addAll(other.pointList_);
                    }
                    this.onChanged();
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (!other.unhidePointList_.isEmpty()) {
                    if (this.unhidePointList_.isEmpty()) {
                        this.unhidePointList_ = other.unhidePointList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureUnhidePointListIsMutable();
                        this.unhidePointList_.addAll(other.unhidePointList_);
                    }
                    this.onChanged();
                }
                if (!other.hidePointList_.isEmpty()) {
                    if (this.hidePointList_.isEmpty()) {
                        this.hidePointList_ = other.hidePointList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    else {
                        this.ensureHidePointListIsMutable();
                        this.hidePointList_.addAll(other.hidePointList_);
                    }
                    this.onChanged();
                }
                if (!other.lockedPointList_.isEmpty()) {
                    if (this.lockedPointList_.isEmpty()) {
                        this.lockedPointList_ = other.lockedPointList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    else {
                        this.ensureLockedPointListIsMutable();
                        this.lockedPointList_.addAll(other.lockedPointList_);
                    }
                    this.onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                ScenePointUnlockNotify parsedMessage = null;
                try {
                    parsedMessage = ScenePointUnlockNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ScenePointUnlockNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensurePointListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.pointList_ = GeneratedMessageV3.mutableCopy(this.pointList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getPointListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.pointList_) : this.pointList_;
            }
            
            @Override
            public int getPointListCount() {
                return this.pointList_.size();
            }
            
            @Override
            public int getPointList(final int index) {
                return this.pointList_.getInt(index);
            }
            
            public Builder setPointList(final int index, final int value) {
                this.ensurePointListIsMutable();
                this.pointList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addPointList(final int value) {
                this.ensurePointListIsMutable();
                this.pointList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllPointList(final Iterable<? extends Integer> values) {
                this.ensurePointListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.pointList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearPointList() {
                this.pointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSceneId() {
                return this.sceneId_;
            }
            
            public Builder setSceneId(final int value) {
                this.sceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneId() {
                this.sceneId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureUnhidePointListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.unhidePointList_ = GeneratedMessageV3.mutableCopy(this.unhidePointList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getUnhidePointListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unhidePointList_) : this.unhidePointList_;
            }
            
            @Override
            public int getUnhidePointListCount() {
                return this.unhidePointList_.size();
            }
            
            @Override
            public int getUnhidePointList(final int index) {
                return this.unhidePointList_.getInt(index);
            }
            
            public Builder setUnhidePointList(final int index, final int value) {
                this.ensureUnhidePointListIsMutable();
                this.unhidePointList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnhidePointList(final int value) {
                this.ensureUnhidePointListIsMutable();
                this.unhidePointList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnhidePointList(final Iterable<? extends Integer> values) {
                this.ensureUnhidePointListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unhidePointList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnhidePointList() {
                this.unhidePointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            private void ensureHidePointListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.hidePointList_ = GeneratedMessageV3.mutableCopy(this.hidePointList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Integer> getHidePointListList() {
                return ((this.bitField0_ & 0x4) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.hidePointList_) : this.hidePointList_;
            }
            
            @Override
            public int getHidePointListCount() {
                return this.hidePointList_.size();
            }
            
            @Override
            public int getHidePointList(final int index) {
                return this.hidePointList_.getInt(index);
            }
            
            public Builder setHidePointList(final int index, final int value) {
                this.ensureHidePointListIsMutable();
                this.hidePointList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addHidePointList(final int value) {
                this.ensureHidePointListIsMutable();
                this.hidePointList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllHidePointList(final Iterable<? extends Integer> values) {
                this.ensureHidePointListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.hidePointList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearHidePointList() {
                this.hidePointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.onChanged();
                return this;
            }
            
            private void ensureLockedPointListIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.lockedPointList_ = GeneratedMessageV3.mutableCopy(this.lockedPointList_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<Integer> getLockedPointListList() {
                return ((this.bitField0_ & 0x8) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.lockedPointList_) : this.lockedPointList_;
            }
            
            @Override
            public int getLockedPointListCount() {
                return this.lockedPointList_.size();
            }
            
            @Override
            public int getLockedPointList(final int index) {
                return this.lockedPointList_.getInt(index);
            }
            
            public Builder setLockedPointList(final int index, final int value) {
                this.ensureLockedPointListIsMutable();
                this.lockedPointList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addLockedPointList(final int value) {
                this.ensureLockedPointListIsMutable();
                this.lockedPointList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllLockedPointList(final Iterable<? extends Integer> values) {
                this.ensureLockedPointListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.lockedPointList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearLockedPointList() {
                this.lockedPointList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFF7;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface ScenePointUnlockNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getPointListList();
        
        int getPointListCount();
        
        int getPointList(final int p0);
        
        int getSceneId();
        
        List<Integer> getUnhidePointListList();
        
        int getUnhidePointListCount();
        
        int getUnhidePointList(final int p0);
        
        List<Integer> getHidePointListList();
        
        int getHidePointListCount();
        
        int getHidePointList(final int p0);
        
        List<Integer> getLockedPointListList();
        
        int getLockedPointListCount();
        
        int getLockedPointList(final int p0);
    }
}
