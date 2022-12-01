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

public final class PlayerEnterDungeonRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerEnterDungeonRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerEnterDungeonRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerEnterDungeonRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerEnterDungeonRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bPlayerEnterDungeonRsp.proto\"N\n\u0015PlayerEnterDungeonRsp\u0012\u0012\n\ndungeon_id\u0018\u0002 \u0001(\r\u0012\u0010\n\bpoint_id\u0018\u0006 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0005 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerEnterDungeonRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerEnterDungeonRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerEnterDungeonRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerEnterDungeonRspOuterClass.internal_static_PlayerEnterDungeonRsp_descriptor, new String[] { "DungeonId", "PointId", "Retcode" });
    }
    
    public static final class PlayerEnterDungeonRsp extends GeneratedMessageV3 implements PlayerEnterDungeonRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DUNGEON_ID_FIELD_NUMBER = 2;
        private int dungeonId_;
        public static final int POINT_ID_FIELD_NUMBER = 6;
        private int pointId_;
        public static final int RETCODE_FIELD_NUMBER = 5;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final PlayerEnterDungeonRsp DEFAULT_INSTANCE;
        private static final Parser<PlayerEnterDungeonRsp> PARSER;
        
        private PlayerEnterDungeonRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerEnterDungeonRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerEnterDungeonRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerEnterDungeonRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.dungeonId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 48: {
                            this.pointId_ = input.readUInt32();
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
            return PlayerEnterDungeonRspOuterClass.internal_static_PlayerEnterDungeonRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerEnterDungeonRspOuterClass.internal_static_PlayerEnterDungeonRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerEnterDungeonRsp.class, Builder.class);
        }
        
        @Override
        public int getDungeonId() {
            return this.dungeonId_;
        }
        
        @Override
        public int getPointId() {
            return this.pointId_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.dungeonId_ != 0) {
                output.writeUInt32(2, this.dungeonId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(5, this.retcode_);
            }
            if (this.pointId_ != 0) {
                output.writeUInt32(6, this.pointId_);
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
            if (this.dungeonId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.dungeonId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(5, this.retcode_);
            }
            if (this.pointId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.pointId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerEnterDungeonRsp)) {
                return super.equals(obj);
            }
            final PlayerEnterDungeonRsp other = (PlayerEnterDungeonRsp)obj;
            return this.getDungeonId() == other.getDungeonId() && this.getPointId() == other.getPointId() && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getDungeonId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getPointId();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerEnterDungeonRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerEnterDungeonRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerEnterDungeonRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerEnterDungeonRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerEnterDungeonRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerEnterDungeonRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerEnterDungeonRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerEnterDungeonRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerEnterDungeonRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerEnterDungeonRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerEnterDungeonRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerEnterDungeonRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerEnterDungeonRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerEnterDungeonRsp.PARSER, input);
        }
        
        public static PlayerEnterDungeonRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerEnterDungeonRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerEnterDungeonRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerEnterDungeonRsp.PARSER, input);
        }
        
        public static PlayerEnterDungeonRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerEnterDungeonRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerEnterDungeonRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerEnterDungeonRsp.PARSER, input);
        }
        
        public static PlayerEnterDungeonRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerEnterDungeonRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerEnterDungeonRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerEnterDungeonRsp prototype) {
            return PlayerEnterDungeonRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerEnterDungeonRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerEnterDungeonRsp getDefaultInstance() {
            return PlayerEnterDungeonRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerEnterDungeonRsp> parser() {
            return PlayerEnterDungeonRsp.PARSER;
        }
        
        @Override
        public Parser<PlayerEnterDungeonRsp> getParserForType() {
            return PlayerEnterDungeonRsp.PARSER;
        }
        
        @Override
        public PlayerEnterDungeonRsp getDefaultInstanceForType() {
            return PlayerEnterDungeonRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerEnterDungeonRsp();
            PARSER = new AbstractParser<PlayerEnterDungeonRsp>() {
                @Override
                public PlayerEnterDungeonRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerEnterDungeonRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerEnterDungeonRspOrBuilder
        {
            private int dungeonId_;
            private int pointId_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerEnterDungeonRspOuterClass.internal_static_PlayerEnterDungeonRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerEnterDungeonRspOuterClass.internal_static_PlayerEnterDungeonRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerEnterDungeonRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerEnterDungeonRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.dungeonId_ = 0;
                this.pointId_ = 0;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerEnterDungeonRspOuterClass.internal_static_PlayerEnterDungeonRsp_descriptor;
            }
            
            @Override
            public PlayerEnterDungeonRsp getDefaultInstanceForType() {
                return PlayerEnterDungeonRsp.getDefaultInstance();
            }
            
            @Override
            public PlayerEnterDungeonRsp build() {
                final PlayerEnterDungeonRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerEnterDungeonRsp buildPartial() {
                final PlayerEnterDungeonRsp result = new PlayerEnterDungeonRsp(this);
                result.dungeonId_ = this.dungeonId_;
                result.pointId_ = this.pointId_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof PlayerEnterDungeonRsp) {
                    return this.mergeFrom((PlayerEnterDungeonRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerEnterDungeonRsp other) {
                if (other == PlayerEnterDungeonRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getDungeonId() != 0) {
                    this.setDungeonId(other.getDungeonId());
                }
                if (other.getPointId() != 0) {
                    this.setPointId(other.getPointId());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                PlayerEnterDungeonRsp parsedMessage = null;
                try {
                    parsedMessage = PlayerEnterDungeonRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerEnterDungeonRsp)e.getUnfinishedMessage();
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
            public int getDungeonId() {
                return this.dungeonId_;
            }
            
            public Builder setDungeonId(final int value) {
                this.dungeonId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDungeonId() {
                this.dungeonId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPointId() {
                return this.pointId_;
            }
            
            public Builder setPointId(final int value) {
                this.pointId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPointId() {
                this.pointId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
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
    
    public interface PlayerEnterDungeonRspOrBuilder extends MessageOrBuilder
    {
        int getDungeonId();
        
        int getPointId();
        
        int getRetcode();
    }
}
