// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SceneNpcInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneNpcInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneNpcInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneNpcInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneNpcInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012SceneNpcInfo.proto\"Z\n\fSceneNpcInfo\u0012\u000e\n\u0006npc_id\u0018\u0001 \u0001(\r\u0012\u000f\n\u0007room_id\u0018\u0002 \u0001(\r\u0012\u0017\n\u000fparent_quest_id\u0018\u0003 \u0001(\r\u0012\u0010\n\bblock_id\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneNpcInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SceneNpcInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneNpcInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneNpcInfoOuterClass.internal_static_SceneNpcInfo_descriptor, new String[] { "NpcId", "RoomId", "ParentQuestId", "BlockId" });
    }
    
    public static final class SceneNpcInfo extends GeneratedMessageV3 implements SceneNpcInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int NPC_ID_FIELD_NUMBER = 1;
        private int npcId_;
        public static final int ROOM_ID_FIELD_NUMBER = 2;
        private int roomId_;
        public static final int PARENT_QUEST_ID_FIELD_NUMBER = 3;
        private int parentQuestId_;
        public static final int BLOCK_ID_FIELD_NUMBER = 4;
        private int blockId_;
        private byte memoizedIsInitialized;
        private static final SceneNpcInfo DEFAULT_INSTANCE;
        private static final Parser<SceneNpcInfo> PARSER;
        
        private SceneNpcInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneNpcInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneNpcInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneNpcInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                            this.npcId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.roomId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.parentQuestId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.blockId_ = input.readUInt32();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneNpcInfoOuterClass.internal_static_SceneNpcInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneNpcInfoOuterClass.internal_static_SceneNpcInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneNpcInfo.class, Builder.class);
        }
        
        @Override
        public int getNpcId() {
            return this.npcId_;
        }
        
        @Override
        public int getRoomId() {
            return this.roomId_;
        }
        
        @Override
        public int getParentQuestId() {
            return this.parentQuestId_;
        }
        
        @Override
        public int getBlockId() {
            return this.blockId_;
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
            if (this.npcId_ != 0) {
                output.writeUInt32(1, this.npcId_);
            }
            if (this.roomId_ != 0) {
                output.writeUInt32(2, this.roomId_);
            }
            if (this.parentQuestId_ != 0) {
                output.writeUInt32(3, this.parentQuestId_);
            }
            if (this.blockId_ != 0) {
                output.writeUInt32(4, this.blockId_);
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
            if (this.npcId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.npcId_);
            }
            if (this.roomId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.roomId_);
            }
            if (this.parentQuestId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.parentQuestId_);
            }
            if (this.blockId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.blockId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneNpcInfo)) {
                return super.equals(obj);
            }
            final SceneNpcInfo other = (SceneNpcInfo)obj;
            return this.getNpcId() == other.getNpcId() && this.getRoomId() == other.getRoomId() && this.getParentQuestId() == other.getParentQuestId() && this.getBlockId() == other.getBlockId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getNpcId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRoomId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getParentQuestId();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getBlockId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneNpcInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneNpcInfo.PARSER.parseFrom(data);
        }
        
        public static SceneNpcInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneNpcInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneNpcInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneNpcInfo.PARSER.parseFrom(data);
        }
        
        public static SceneNpcInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneNpcInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneNpcInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneNpcInfo.PARSER.parseFrom(data);
        }
        
        public static SceneNpcInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneNpcInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneNpcInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneNpcInfo.PARSER, input);
        }
        
        public static SceneNpcInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneNpcInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneNpcInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneNpcInfo.PARSER, input);
        }
        
        public static SceneNpcInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneNpcInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneNpcInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneNpcInfo.PARSER, input);
        }
        
        public static SceneNpcInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneNpcInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneNpcInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneNpcInfo prototype) {
            return SceneNpcInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneNpcInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneNpcInfo getDefaultInstance() {
            return SceneNpcInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneNpcInfo> parser() {
            return SceneNpcInfo.PARSER;
        }
        
        @Override
        public Parser<SceneNpcInfo> getParserForType() {
            return SceneNpcInfo.PARSER;
        }
        
        @Override
        public SceneNpcInfo getDefaultInstanceForType() {
            return SceneNpcInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneNpcInfo();
            PARSER = new AbstractParser<SceneNpcInfo>() {
                @Override
                public SceneNpcInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneNpcInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneNpcInfoOrBuilder
        {
            private int npcId_;
            private int roomId_;
            private int parentQuestId_;
            private int blockId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneNpcInfoOuterClass.internal_static_SceneNpcInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneNpcInfoOuterClass.internal_static_SceneNpcInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneNpcInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneNpcInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.npcId_ = 0;
                this.roomId_ = 0;
                this.parentQuestId_ = 0;
                this.blockId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneNpcInfoOuterClass.internal_static_SceneNpcInfo_descriptor;
            }
            
            @Override
            public SceneNpcInfo getDefaultInstanceForType() {
                return SceneNpcInfo.getDefaultInstance();
            }
            
            @Override
            public SceneNpcInfo build() {
                final SceneNpcInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneNpcInfo buildPartial() {
                final SceneNpcInfo result = new SceneNpcInfo(this);
                result.npcId_ = this.npcId_;
                result.roomId_ = this.roomId_;
                result.parentQuestId_ = this.parentQuestId_;
                result.blockId_ = this.blockId_;
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
                if (other instanceof SceneNpcInfo) {
                    return this.mergeFrom((SceneNpcInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneNpcInfo other) {
                if (other == SceneNpcInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getNpcId() != 0) {
                    this.setNpcId(other.getNpcId());
                }
                if (other.getRoomId() != 0) {
                    this.setRoomId(other.getRoomId());
                }
                if (other.getParentQuestId() != 0) {
                    this.setParentQuestId(other.getParentQuestId());
                }
                if (other.getBlockId() != 0) {
                    this.setBlockId(other.getBlockId());
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
                SceneNpcInfo parsedMessage = null;
                try {
                    parsedMessage = SceneNpcInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneNpcInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getNpcId() {
                return this.npcId_;
            }
            
            public Builder setNpcId(final int value) {
                this.npcId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNpcId() {
                this.npcId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRoomId() {
                return this.roomId_;
            }
            
            public Builder setRoomId(final int value) {
                this.roomId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRoomId() {
                this.roomId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParentQuestId() {
                return this.parentQuestId_;
            }
            
            public Builder setParentQuestId(final int value) {
                this.parentQuestId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParentQuestId() {
                this.parentQuestId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBlockId() {
                return this.blockId_;
            }
            
            public Builder setBlockId(final int value) {
                this.blockId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBlockId() {
                this.blockId_ = 0;
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
    
    public interface SceneNpcInfoOrBuilder extends MessageOrBuilder
    {
        int getNpcId();
        
        int getRoomId();
        
        int getParentQuestId();
        
        int getBlockId();
    }
}
