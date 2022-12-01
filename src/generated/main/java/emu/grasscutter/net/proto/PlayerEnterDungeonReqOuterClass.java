// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
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

public final class PlayerEnterDungeonReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerEnterDungeonReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerEnterDungeonReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerEnterDungeonReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerEnterDungeonReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bPlayerEnterDungeonReq.proto\u001a\u0019Unk2800_JKLFAJKDLDG.proto\"p\n\u0015PlayerEnterDungeonReq\u00121\n\u0013Unk2800_ANJAHBGBIFD\u0018\u0002 \u0001(\u000b2\u0014.Unk2800_JKLFAJKDLDG\u0012\u0010\n\bpoint_id\u0018\r \u0001(\r\u0012\u0012\n\ndungeon_id\u0018\u0007 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerEnterDungeonReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { Unk2800JKLFAJKDLDG.getDescriptor() });
        internal_static_PlayerEnterDungeonReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerEnterDungeonReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor, new String[] { "Unk2800ANJAHBGBIFD", "PointId", "DungeonId" });
        Unk2800JKLFAJKDLDG.getDescriptor();
    }
    
    public static final class PlayerEnterDungeonReq extends GeneratedMessageV3 implements PlayerEnterDungeonReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK2800_ANJAHBGBIFD_FIELD_NUMBER = 2;
        private Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG unk2800ANJAHBGBIFD_;
        public static final int POINT_ID_FIELD_NUMBER = 13;
        private int pointId_;
        public static final int DUNGEON_ID_FIELD_NUMBER = 7;
        private int dungeonId_;
        private byte memoizedIsInitialized;
        private static final PlayerEnterDungeonReq DEFAULT_INSTANCE;
        private static final Parser<PlayerEnterDungeonReq> PARSER;
        
        private PlayerEnterDungeonReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerEnterDungeonReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerEnterDungeonReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerEnterDungeonReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder subBuilder = null;
                            if (this.unk2800ANJAHBGBIFD_ != null) {
                                subBuilder = this.unk2800ANJAHBGBIFD_.toBuilder();
                            }
                            this.unk2800ANJAHBGBIFD_ = input.readMessage(Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.unk2800ANJAHBGBIFD_);
                                this.unk2800ANJAHBGBIFD_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 56: {
                            this.dungeonId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
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
            return PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerEnterDungeonReq.class, Builder.class);
        }
        
        @Override
        public boolean hasUnk2800ANJAHBGBIFD() {
            return this.unk2800ANJAHBGBIFD_ != null;
        }
        
        @Override
        public Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG getUnk2800ANJAHBGBIFD() {
            return (this.unk2800ANJAHBGBIFD_ == null) ? Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.getDefaultInstance() : this.unk2800ANJAHBGBIFD_;
        }
        
        @Override
        public Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder getUnk2800ANJAHBGBIFDOrBuilder() {
            return this.getUnk2800ANJAHBGBIFD();
        }
        
        @Override
        public int getPointId() {
            return this.pointId_;
        }
        
        @Override
        public int getDungeonId() {
            return this.dungeonId_;
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
            if (this.unk2800ANJAHBGBIFD_ != null) {
                output.writeMessage(2, this.getUnk2800ANJAHBGBIFD());
            }
            if (this.dungeonId_ != 0) {
                output.writeUInt32(7, this.dungeonId_);
            }
            if (this.pointId_ != 0) {
                output.writeUInt32(13, this.pointId_);
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
            if (this.unk2800ANJAHBGBIFD_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getUnk2800ANJAHBGBIFD());
            }
            if (this.dungeonId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.dungeonId_);
            }
            if (this.pointId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.pointId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerEnterDungeonReq)) {
                return super.equals(obj);
            }
            final PlayerEnterDungeonReq other = (PlayerEnterDungeonReq)obj;
            return this.hasUnk2800ANJAHBGBIFD() == other.hasUnk2800ANJAHBGBIFD() && (!this.hasUnk2800ANJAHBGBIFD() || this.getUnk2800ANJAHBGBIFD().equals(other.getUnk2800ANJAHBGBIFD())) && this.getPointId() == other.getPointId() && this.getDungeonId() == other.getDungeonId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasUnk2800ANJAHBGBIFD()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getUnk2800ANJAHBGBIFD().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getPointId();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getDungeonId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerEnterDungeonReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerEnterDungeonReq.PARSER.parseFrom(data);
        }
        
        public static PlayerEnterDungeonReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerEnterDungeonReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerEnterDungeonReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerEnterDungeonReq.PARSER.parseFrom(data);
        }
        
        public static PlayerEnterDungeonReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerEnterDungeonReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerEnterDungeonReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerEnterDungeonReq.PARSER.parseFrom(data);
        }
        
        public static PlayerEnterDungeonReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerEnterDungeonReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerEnterDungeonReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerEnterDungeonReq.PARSER, input);
        }
        
        public static PlayerEnterDungeonReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerEnterDungeonReq.PARSER, input, extensionRegistry);
        }
        
        public static PlayerEnterDungeonReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerEnterDungeonReq.PARSER, input);
        }
        
        public static PlayerEnterDungeonReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerEnterDungeonReq.PARSER, input, extensionRegistry);
        }
        
        public static PlayerEnterDungeonReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerEnterDungeonReq.PARSER, input);
        }
        
        public static PlayerEnterDungeonReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerEnterDungeonReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerEnterDungeonReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerEnterDungeonReq prototype) {
            return PlayerEnterDungeonReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerEnterDungeonReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerEnterDungeonReq getDefaultInstance() {
            return PlayerEnterDungeonReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerEnterDungeonReq> parser() {
            return PlayerEnterDungeonReq.PARSER;
        }
        
        @Override
        public Parser<PlayerEnterDungeonReq> getParserForType() {
            return PlayerEnterDungeonReq.PARSER;
        }
        
        @Override
        public PlayerEnterDungeonReq getDefaultInstanceForType() {
            return PlayerEnterDungeonReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerEnterDungeonReq();
            PARSER = new AbstractParser<PlayerEnterDungeonReq>() {
                @Override
                public PlayerEnterDungeonReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerEnterDungeonReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerEnterDungeonReqOrBuilder
        {
            private Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG unk2800ANJAHBGBIFD_;
            private SingleFieldBuilderV3<Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG, Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder, Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder> unk2800ANJAHBGBIFDBuilder_;
            private int pointId_;
            private int dungeonId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerEnterDungeonReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerEnterDungeonReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.unk2800ANJAHBGBIFDBuilder_ == null) {
                    this.unk2800ANJAHBGBIFD_ = null;
                }
                else {
                    this.unk2800ANJAHBGBIFD_ = null;
                    this.unk2800ANJAHBGBIFDBuilder_ = null;
                }
                this.pointId_ = 0;
                this.dungeonId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor;
            }
            
            @Override
            public PlayerEnterDungeonReq getDefaultInstanceForType() {
                return PlayerEnterDungeonReq.getDefaultInstance();
            }
            
            @Override
            public PlayerEnterDungeonReq build() {
                final PlayerEnterDungeonReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerEnterDungeonReq buildPartial() {
                final PlayerEnterDungeonReq result = new PlayerEnterDungeonReq(this);
                if (this.unk2800ANJAHBGBIFDBuilder_ == null) {
                    result.unk2800ANJAHBGBIFD_ = this.unk2800ANJAHBGBIFD_;
                }
                else {
                    result.unk2800ANJAHBGBIFD_ = this.unk2800ANJAHBGBIFDBuilder_.build();
                }
                result.pointId_ = this.pointId_;
                result.dungeonId_ = this.dungeonId_;
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
                if (other instanceof PlayerEnterDungeonReq) {
                    return this.mergeFrom((PlayerEnterDungeonReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerEnterDungeonReq other) {
                if (other == PlayerEnterDungeonReq.getDefaultInstance()) {
                    return this;
                }
                if (other.hasUnk2800ANJAHBGBIFD()) {
                    this.mergeUnk2800ANJAHBGBIFD(other.getUnk2800ANJAHBGBIFD());
                }
                if (other.getPointId() != 0) {
                    this.setPointId(other.getPointId());
                }
                if (other.getDungeonId() != 0) {
                    this.setDungeonId(other.getDungeonId());
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
                PlayerEnterDungeonReq parsedMessage = null;
                try {
                    parsedMessage = PlayerEnterDungeonReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerEnterDungeonReq)e.getUnfinishedMessage();
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
            public boolean hasUnk2800ANJAHBGBIFD() {
                return this.unk2800ANJAHBGBIFDBuilder_ != null || this.unk2800ANJAHBGBIFD_ != null;
            }
            
            @Override
            public Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG getUnk2800ANJAHBGBIFD() {
                if (this.unk2800ANJAHBGBIFDBuilder_ == null) {
                    return (this.unk2800ANJAHBGBIFD_ == null) ? Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.getDefaultInstance() : this.unk2800ANJAHBGBIFD_;
                }
                return this.unk2800ANJAHBGBIFDBuilder_.getMessage();
            }
            
            public Builder setUnk2800ANJAHBGBIFD(final Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG value) {
                if (this.unk2800ANJAHBGBIFDBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.unk2800ANJAHBGBIFD_ = value;
                    this.onChanged();
                }
                else {
                    this.unk2800ANJAHBGBIFDBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setUnk2800ANJAHBGBIFD(final Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder builderForValue) {
                if (this.unk2800ANJAHBGBIFDBuilder_ == null) {
                    this.unk2800ANJAHBGBIFD_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.unk2800ANJAHBGBIFDBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeUnk2800ANJAHBGBIFD(final Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG value) {
                if (this.unk2800ANJAHBGBIFDBuilder_ == null) {
                    if (this.unk2800ANJAHBGBIFD_ != null) {
                        this.unk2800ANJAHBGBIFD_ = Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.newBuilder(this.unk2800ANJAHBGBIFD_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.unk2800ANJAHBGBIFD_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.unk2800ANJAHBGBIFDBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearUnk2800ANJAHBGBIFD() {
                if (this.unk2800ANJAHBGBIFDBuilder_ == null) {
                    this.unk2800ANJAHBGBIFD_ = null;
                    this.onChanged();
                }
                else {
                    this.unk2800ANJAHBGBIFD_ = null;
                    this.unk2800ANJAHBGBIFDBuilder_ = null;
                }
                return this;
            }
            
            public Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder getUnk2800ANJAHBGBIFDBuilder() {
                this.onChanged();
                return this.getUnk2800ANJAHBGBIFDFieldBuilder().getBuilder();
            }
            
            @Override
            public Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder getUnk2800ANJAHBGBIFDOrBuilder() {
                if (this.unk2800ANJAHBGBIFDBuilder_ != null) {
                    return this.unk2800ANJAHBGBIFDBuilder_.getMessageOrBuilder();
                }
                return (this.unk2800ANJAHBGBIFD_ == null) ? Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.getDefaultInstance() : this.unk2800ANJAHBGBIFD_;
            }
            
            private SingleFieldBuilderV3<Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG, Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder, Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder> getUnk2800ANJAHBGBIFDFieldBuilder() {
                if (this.unk2800ANJAHBGBIFDBuilder_ == null) {
                    this.unk2800ANJAHBGBIFDBuilder_ = new SingleFieldBuilderV3<Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG, Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder, Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder>(this.getUnk2800ANJAHBGBIFD(), this.getParentForChildren(), this.isClean());
                    this.unk2800ANJAHBGBIFD_ = null;
                }
                return this.unk2800ANJAHBGBIFDBuilder_;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface PlayerEnterDungeonReqOrBuilder extends MessageOrBuilder
    {
        boolean hasUnk2800ANJAHBGBIFD();
        
        Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG getUnk2800ANJAHBGBIFD();
        
        Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder getUnk2800ANJAHBGBIFDOrBuilder();
        
        int getPointId();
        
        int getDungeonId();
    }
}
