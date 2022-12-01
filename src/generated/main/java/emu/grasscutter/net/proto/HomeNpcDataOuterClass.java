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

public final class HomeNpcDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeNpcData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeNpcData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeNpcDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeNpcDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011HomeNpcData.proto\u001a\fVector.proto\"l\n\u000bHomeNpcData\u0012\u0011\n\tavatar_id\u0018\u000e \u0001(\r\u0012\u001a\n\tspawn_pos\u0018\u000f \u0001(\u000b2\u0007.Vector\u0012\u0012\n\ncostume_id\u0018\u0003 \u0001(\r\u0012\u001a\n\tspawn_rot\u0018\r \u0001(\u000b2\u0007.VectorB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeNpcDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_HomeNpcData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeNpcData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeNpcDataOuterClass.internal_static_HomeNpcData_descriptor, new String[] { "AvatarId", "SpawnPos", "CostumeId", "SpawnRot" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class HomeNpcData extends GeneratedMessageV3 implements HomeNpcDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_ID_FIELD_NUMBER = 14;
        private int avatarId_;
        public static final int SPAWN_POS_FIELD_NUMBER = 15;
        private VectorOuterClass.Vector spawnPos_;
        public static final int COSTUME_ID_FIELD_NUMBER = 3;
        private int costumeId_;
        public static final int SPAWN_ROT_FIELD_NUMBER = 13;
        private VectorOuterClass.Vector spawnRot_;
        private byte memoizedIsInitialized;
        private static final HomeNpcData DEFAULT_INSTANCE;
        private static final Parser<HomeNpcData> PARSER;
        
        private HomeNpcData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeNpcData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeNpcData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeNpcData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.costumeId_ = input.readUInt32();
                            continue;
                        }
                        case 106: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.spawnRot_ != null) {
                                subBuilder = this.spawnRot_.toBuilder();
                            }
                            this.spawnRot_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.spawnRot_);
                                this.spawnRot_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 112: {
                            this.avatarId_ = input.readUInt32();
                            continue;
                        }
                        case 122: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.spawnPos_ != null) {
                                subBuilder = this.spawnPos_.toBuilder();
                            }
                            this.spawnPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.spawnPos_);
                                this.spawnPos_ = subBuilder.buildPartial();
                                continue;
                            }
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
            return HomeNpcDataOuterClass.internal_static_HomeNpcData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeNpcDataOuterClass.internal_static_HomeNpcData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeNpcData.class, Builder.class);
        }
        
        @Override
        public int getAvatarId() {
            return this.avatarId_;
        }
        
        @Override
        public boolean hasSpawnPos() {
            return this.spawnPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getSpawnPos() {
            return (this.spawnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
            return this.getSpawnPos();
        }
        
        @Override
        public int getCostumeId() {
            return this.costumeId_;
        }
        
        @Override
        public boolean hasSpawnRot() {
            return this.spawnRot_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getSpawnRot() {
            return (this.spawnRot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnRot_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder() {
            return this.getSpawnRot();
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
            if (this.costumeId_ != 0) {
                output.writeUInt32(3, this.costumeId_);
            }
            if (this.spawnRot_ != null) {
                output.writeMessage(13, this.getSpawnRot());
            }
            if (this.avatarId_ != 0) {
                output.writeUInt32(14, this.avatarId_);
            }
            if (this.spawnPos_ != null) {
                output.writeMessage(15, this.getSpawnPos());
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
            if (this.costumeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.costumeId_);
            }
            if (this.spawnRot_ != null) {
                size += CodedOutputStream.computeMessageSize(13, this.getSpawnRot());
            }
            if (this.avatarId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.avatarId_);
            }
            if (this.spawnPos_ != null) {
                size += CodedOutputStream.computeMessageSize(15, this.getSpawnPos());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeNpcData)) {
                return super.equals(obj);
            }
            final HomeNpcData other = (HomeNpcData)obj;
            return this.getAvatarId() == other.getAvatarId() && this.hasSpawnPos() == other.hasSpawnPos() && (!this.hasSpawnPos() || this.getSpawnPos().equals(other.getSpawnPos())) && this.getCostumeId() == other.getCostumeId() && this.hasSpawnRot() == other.hasSpawnRot() && (!this.hasSpawnRot() || this.getSpawnRot().equals(other.getSpawnRot())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getAvatarId();
            if (this.hasSpawnPos()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getSpawnPos().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCostumeId();
            if (this.hasSpawnRot()) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getSpawnRot().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeNpcData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeNpcData.PARSER.parseFrom(data);
        }
        
        public static HomeNpcData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeNpcData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeNpcData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeNpcData.PARSER.parseFrom(data);
        }
        
        public static HomeNpcData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeNpcData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeNpcData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeNpcData.PARSER.parseFrom(data);
        }
        
        public static HomeNpcData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeNpcData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeNpcData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeNpcData.PARSER, input);
        }
        
        public static HomeNpcData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeNpcData.PARSER, input, extensionRegistry);
        }
        
        public static HomeNpcData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeNpcData.PARSER, input);
        }
        
        public static HomeNpcData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeNpcData.PARSER, input, extensionRegistry);
        }
        
        public static HomeNpcData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeNpcData.PARSER, input);
        }
        
        public static HomeNpcData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeNpcData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeNpcData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeNpcData prototype) {
            return HomeNpcData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeNpcData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeNpcData getDefaultInstance() {
            return HomeNpcData.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeNpcData> parser() {
            return HomeNpcData.PARSER;
        }
        
        @Override
        public Parser<HomeNpcData> getParserForType() {
            return HomeNpcData.PARSER;
        }
        
        @Override
        public HomeNpcData getDefaultInstanceForType() {
            return HomeNpcData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeNpcData();
            PARSER = new AbstractParser<HomeNpcData>() {
                @Override
                public HomeNpcData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeNpcData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeNpcDataOrBuilder
        {
            private int avatarId_;
            private VectorOuterClass.Vector spawnPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> spawnPosBuilder_;
            private int costumeId_;
            private VectorOuterClass.Vector spawnRot_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> spawnRotBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeNpcDataOuterClass.internal_static_HomeNpcData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeNpcDataOuterClass.internal_static_HomeNpcData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeNpcData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeNpcData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarId_ = 0;
                if (this.spawnPosBuilder_ == null) {
                    this.spawnPos_ = null;
                }
                else {
                    this.spawnPos_ = null;
                    this.spawnPosBuilder_ = null;
                }
                this.costumeId_ = 0;
                if (this.spawnRotBuilder_ == null) {
                    this.spawnRot_ = null;
                }
                else {
                    this.spawnRot_ = null;
                    this.spawnRotBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeNpcDataOuterClass.internal_static_HomeNpcData_descriptor;
            }
            
            @Override
            public HomeNpcData getDefaultInstanceForType() {
                return HomeNpcData.getDefaultInstance();
            }
            
            @Override
            public HomeNpcData build() {
                final HomeNpcData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeNpcData buildPartial() {
                final HomeNpcData result = new HomeNpcData(this);
                result.avatarId_ = this.avatarId_;
                if (this.spawnPosBuilder_ == null) {
                    result.spawnPos_ = this.spawnPos_;
                }
                else {
                    result.spawnPos_ = this.spawnPosBuilder_.build();
                }
                result.costumeId_ = this.costumeId_;
                if (this.spawnRotBuilder_ == null) {
                    result.spawnRot_ = this.spawnRot_;
                }
                else {
                    result.spawnRot_ = this.spawnRotBuilder_.build();
                }
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
                if (other instanceof HomeNpcData) {
                    return this.mergeFrom((HomeNpcData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeNpcData other) {
                if (other == HomeNpcData.getDefaultInstance()) {
                    return this;
                }
                if (other.getAvatarId() != 0) {
                    this.setAvatarId(other.getAvatarId());
                }
                if (other.hasSpawnPos()) {
                    this.mergeSpawnPos(other.getSpawnPos());
                }
                if (other.getCostumeId() != 0) {
                    this.setCostumeId(other.getCostumeId());
                }
                if (other.hasSpawnRot()) {
                    this.mergeSpawnRot(other.getSpawnRot());
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
                HomeNpcData parsedMessage = null;
                try {
                    parsedMessage = HomeNpcData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeNpcData)e.getUnfinishedMessage();
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
            public int getAvatarId() {
                return this.avatarId_;
            }
            
            public Builder setAvatarId(final int value) {
                this.avatarId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarId() {
                this.avatarId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasSpawnPos() {
                return this.spawnPosBuilder_ != null || this.spawnPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getSpawnPos() {
                if (this.spawnPosBuilder_ == null) {
                    return (this.spawnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnPos_;
                }
                return this.spawnPosBuilder_.getMessage();
            }
            
            public Builder setSpawnPos(final VectorOuterClass.Vector value) {
                if (this.spawnPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.spawnPos_ = value;
                    this.onChanged();
                }
                else {
                    this.spawnPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setSpawnPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.spawnPosBuilder_ == null) {
                    this.spawnPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.spawnPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeSpawnPos(final VectorOuterClass.Vector value) {
                if (this.spawnPosBuilder_ == null) {
                    if (this.spawnPos_ != null) {
                        this.spawnPos_ = VectorOuterClass.Vector.newBuilder(this.spawnPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.spawnPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.spawnPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearSpawnPos() {
                if (this.spawnPosBuilder_ == null) {
                    this.spawnPos_ = null;
                    this.onChanged();
                }
                else {
                    this.spawnPos_ = null;
                    this.spawnPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getSpawnPosBuilder() {
                this.onChanged();
                return this.getSpawnPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
                if (this.spawnPosBuilder_ != null) {
                    return this.spawnPosBuilder_.getMessageOrBuilder();
                }
                return (this.spawnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getSpawnPosFieldBuilder() {
                if (this.spawnPosBuilder_ == null) {
                    this.spawnPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getSpawnPos(), this.getParentForChildren(), this.isClean());
                    this.spawnPos_ = null;
                }
                return this.spawnPosBuilder_;
            }
            
            @Override
            public int getCostumeId() {
                return this.costumeId_;
            }
            
            public Builder setCostumeId(final int value) {
                this.costumeId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCostumeId() {
                this.costumeId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasSpawnRot() {
                return this.spawnRotBuilder_ != null || this.spawnRot_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getSpawnRot() {
                if (this.spawnRotBuilder_ == null) {
                    return (this.spawnRot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnRot_;
                }
                return this.spawnRotBuilder_.getMessage();
            }
            
            public Builder setSpawnRot(final VectorOuterClass.Vector value) {
                if (this.spawnRotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.spawnRot_ = value;
                    this.onChanged();
                }
                else {
                    this.spawnRotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setSpawnRot(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.spawnRotBuilder_ == null) {
                    this.spawnRot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.spawnRotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeSpawnRot(final VectorOuterClass.Vector value) {
                if (this.spawnRotBuilder_ == null) {
                    if (this.spawnRot_ != null) {
                        this.spawnRot_ = VectorOuterClass.Vector.newBuilder(this.spawnRot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.spawnRot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.spawnRotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearSpawnRot() {
                if (this.spawnRotBuilder_ == null) {
                    this.spawnRot_ = null;
                    this.onChanged();
                }
                else {
                    this.spawnRot_ = null;
                    this.spawnRotBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getSpawnRotBuilder() {
                this.onChanged();
                return this.getSpawnRotFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder() {
                if (this.spawnRotBuilder_ != null) {
                    return this.spawnRotBuilder_.getMessageOrBuilder();
                }
                return (this.spawnRot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.spawnRot_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getSpawnRotFieldBuilder() {
                if (this.spawnRotBuilder_ == null) {
                    this.spawnRotBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getSpawnRot(), this.getParentForChildren(), this.isClean());
                    this.spawnRot_ = null;
                }
                return this.spawnRotBuilder_;
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
    
    public interface HomeNpcDataOrBuilder extends MessageOrBuilder
    {
        int getAvatarId();
        
        boolean hasSpawnPos();
        
        VectorOuterClass.Vector getSpawnPos();
        
        VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder();
        
        int getCostumeId();
        
        boolean hasSpawnRot();
        
        VectorOuterClass.Vector getSpawnRot();
        
        VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder();
    }
}
