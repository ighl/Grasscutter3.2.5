// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
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

public final class FurnitureMakeBeHelpedDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_FurnitureMakeBeHelpedData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FurnitureMakeBeHelpedData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FurnitureMakeBeHelpedDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FurnitureMakeBeHelpedDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fFurnitureMakeBeHelpedData.proto\u001a\u0014ProfilePicture.proto\"\u0083\u0001\n\u0019FurnitureMakeBeHelpedData\u0012\f\n\u0004time\u0018\f \u0001(\u0007\u0012\f\n\u0004icon\u0018\u000b \u0001(\r\u0012\u000b\n\u0003uid\u0018\u0007 \u0001(\r\u0012\u0013\n\u000bplayer_name\u0018\n \u0001(\t\u0012(\n\u000fprofile_picture\u0018\u0001 \u0001(\u000b2\u000f.ProfilePictureB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FurnitureMakeBeHelpedDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ProfilePictureOuterClass.getDescriptor() });
        internal_static_FurnitureMakeBeHelpedData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FurnitureMakeBeHelpedData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FurnitureMakeBeHelpedDataOuterClass.internal_static_FurnitureMakeBeHelpedData_descriptor, new String[] { "Time", "Icon", "Uid", "PlayerName", "ProfilePicture" });
        ProfilePictureOuterClass.getDescriptor();
    }
    
    public static final class FurnitureMakeBeHelpedData extends GeneratedMessageV3 implements FurnitureMakeBeHelpedDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TIME_FIELD_NUMBER = 12;
        private int time_;
        public static final int ICON_FIELD_NUMBER = 11;
        private int icon_;
        public static final int UID_FIELD_NUMBER = 7;
        private int uid_;
        public static final int PLAYER_NAME_FIELD_NUMBER = 10;
        private volatile Object playerName_;
        public static final int PROFILE_PICTURE_FIELD_NUMBER = 1;
        private ProfilePictureOuterClass.ProfilePicture profilePicture_;
        private byte memoizedIsInitialized;
        private static final FurnitureMakeBeHelpedData DEFAULT_INSTANCE;
        private static final Parser<FurnitureMakeBeHelpedData> PARSER;
        
        private FurnitureMakeBeHelpedData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FurnitureMakeBeHelpedData() {
            this.memoizedIsInitialized = -1;
            this.playerName_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FurnitureMakeBeHelpedData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FurnitureMakeBeHelpedData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            ProfilePictureOuterClass.ProfilePicture.Builder subBuilder = null;
                            if (this.profilePicture_ != null) {
                                subBuilder = this.profilePicture_.toBuilder();
                            }
                            this.profilePicture_ = input.readMessage(ProfilePictureOuterClass.ProfilePicture.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.profilePicture_);
                                this.profilePicture_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 56: {
                            this.uid_ = input.readUInt32();
                            continue;
                        }
                        case 82: {
                            final String s = input.readStringRequireUtf8();
                            this.playerName_ = s;
                            continue;
                        }
                        case 88: {
                            this.icon_ = input.readUInt32();
                            continue;
                        }
                        case 101: {
                            this.time_ = input.readFixed32();
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
            return FurnitureMakeBeHelpedDataOuterClass.internal_static_FurnitureMakeBeHelpedData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FurnitureMakeBeHelpedDataOuterClass.internal_static_FurnitureMakeBeHelpedData_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeBeHelpedData.class, Builder.class);
        }
        
        @Override
        public int getTime() {
            return this.time_;
        }
        
        @Override
        public int getIcon() {
            return this.icon_;
        }
        
        @Override
        public int getUid() {
            return this.uid_;
        }
        
        @Override
        public String getPlayerName() {
            final Object ref = this.playerName_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.playerName_ = s);
        }
        
        @Override
        public ByteString getPlayerNameBytes() {
            final Object ref = this.playerName_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.playerName_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean hasProfilePicture() {
            return this.profilePicture_ != null;
        }
        
        @Override
        public ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
            return (this.profilePicture_ == null) ? ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : this.profilePicture_;
        }
        
        @Override
        public ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
            return this.getProfilePicture();
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
            if (this.profilePicture_ != null) {
                output.writeMessage(1, this.getProfilePicture());
            }
            if (this.uid_ != 0) {
                output.writeUInt32(7, this.uid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.playerName_)) {
                GeneratedMessageV3.writeString(output, 10, this.playerName_);
            }
            if (this.icon_ != 0) {
                output.writeUInt32(11, this.icon_);
            }
            if (this.time_ != 0) {
                output.writeFixed32(12, this.time_);
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
            if (this.profilePicture_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getProfilePicture());
            }
            if (this.uid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.uid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.playerName_)) {
                size += GeneratedMessageV3.computeStringSize(10, this.playerName_);
            }
            if (this.icon_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.icon_);
            }
            if (this.time_ != 0) {
                size += CodedOutputStream.computeFixed32Size(12, this.time_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FurnitureMakeBeHelpedData)) {
                return super.equals(obj);
            }
            final FurnitureMakeBeHelpedData other = (FurnitureMakeBeHelpedData)obj;
            return this.getTime() == other.getTime() && this.getIcon() == other.getIcon() && this.getUid() == other.getUid() && this.getPlayerName().equals(other.getPlayerName()) && this.hasProfilePicture() == other.hasProfilePicture() && (!this.hasProfilePicture() || this.getProfilePicture().equals(other.getProfilePicture())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getTime();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getIcon();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getUid();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getPlayerName().hashCode();
            if (this.hasProfilePicture()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getProfilePicture().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FurnitureMakeBeHelpedData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FurnitureMakeBeHelpedData.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeBeHelpedData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeBeHelpedData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeBeHelpedData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FurnitureMakeBeHelpedData.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeBeHelpedData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeBeHelpedData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeBeHelpedData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FurnitureMakeBeHelpedData.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeBeHelpedData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeBeHelpedData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeBeHelpedData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeBeHelpedData.PARSER, input);
        }
        
        public static FurnitureMakeBeHelpedData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeBeHelpedData.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeBeHelpedData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeBeHelpedData.PARSER, input);
        }
        
        public static FurnitureMakeBeHelpedData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeBeHelpedData.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeBeHelpedData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeBeHelpedData.PARSER, input);
        }
        
        public static FurnitureMakeBeHelpedData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeBeHelpedData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FurnitureMakeBeHelpedData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FurnitureMakeBeHelpedData prototype) {
            return FurnitureMakeBeHelpedData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FurnitureMakeBeHelpedData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FurnitureMakeBeHelpedData getDefaultInstance() {
            return FurnitureMakeBeHelpedData.DEFAULT_INSTANCE;
        }
        
        public static Parser<FurnitureMakeBeHelpedData> parser() {
            return FurnitureMakeBeHelpedData.PARSER;
        }
        
        @Override
        public Parser<FurnitureMakeBeHelpedData> getParserForType() {
            return FurnitureMakeBeHelpedData.PARSER;
        }
        
        @Override
        public FurnitureMakeBeHelpedData getDefaultInstanceForType() {
            return FurnitureMakeBeHelpedData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FurnitureMakeBeHelpedData();
            PARSER = new AbstractParser<FurnitureMakeBeHelpedData>() {
                @Override
                public FurnitureMakeBeHelpedData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FurnitureMakeBeHelpedData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FurnitureMakeBeHelpedDataOrBuilder
        {
            private int time_;
            private int icon_;
            private int uid_;
            private Object playerName_;
            private ProfilePictureOuterClass.ProfilePicture profilePicture_;
            private SingleFieldBuilderV3<ProfilePictureOuterClass.ProfilePicture, ProfilePictureOuterClass.ProfilePicture.Builder, ProfilePictureOuterClass.ProfilePictureOrBuilder> profilePictureBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FurnitureMakeBeHelpedDataOuterClass.internal_static_FurnitureMakeBeHelpedData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FurnitureMakeBeHelpedDataOuterClass.internal_static_FurnitureMakeBeHelpedData_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeBeHelpedData.class, Builder.class);
            }
            
            private Builder() {
                this.playerName_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.playerName_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FurnitureMakeBeHelpedData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.time_ = 0;
                this.icon_ = 0;
                this.uid_ = 0;
                this.playerName_ = "";
                if (this.profilePictureBuilder_ == null) {
                    this.profilePicture_ = null;
                }
                else {
                    this.profilePicture_ = null;
                    this.profilePictureBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FurnitureMakeBeHelpedDataOuterClass.internal_static_FurnitureMakeBeHelpedData_descriptor;
            }
            
            @Override
            public FurnitureMakeBeHelpedData getDefaultInstanceForType() {
                return FurnitureMakeBeHelpedData.getDefaultInstance();
            }
            
            @Override
            public FurnitureMakeBeHelpedData build() {
                final FurnitureMakeBeHelpedData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FurnitureMakeBeHelpedData buildPartial() {
                final FurnitureMakeBeHelpedData result = new FurnitureMakeBeHelpedData(this);
                result.time_ = this.time_;
                result.icon_ = this.icon_;
                result.uid_ = this.uid_;
                result.playerName_ = this.playerName_;
                if (this.profilePictureBuilder_ == null) {
                    result.profilePicture_ = this.profilePicture_;
                }
                else {
                    result.profilePicture_ = this.profilePictureBuilder_.build();
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
                if (other instanceof FurnitureMakeBeHelpedData) {
                    return this.mergeFrom((FurnitureMakeBeHelpedData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FurnitureMakeBeHelpedData other) {
                if (other == FurnitureMakeBeHelpedData.getDefaultInstance()) {
                    return this;
                }
                if (other.getTime() != 0) {
                    this.setTime(other.getTime());
                }
                if (other.getIcon() != 0) {
                    this.setIcon(other.getIcon());
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
                }
                if (!other.getPlayerName().isEmpty()) {
                    this.playerName_ = other.playerName_;
                    this.onChanged();
                }
                if (other.hasProfilePicture()) {
                    this.mergeProfilePicture(other.getProfilePicture());
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
                FurnitureMakeBeHelpedData parsedMessage = null;
                try {
                    parsedMessage = FurnitureMakeBeHelpedData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FurnitureMakeBeHelpedData)e.getUnfinishedMessage();
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
            public int getTime() {
                return this.time_;
            }
            
            public Builder setTime(final int value) {
                this.time_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTime() {
                this.time_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getIcon() {
                return this.icon_;
            }
            
            public Builder setIcon(final int value) {
                this.icon_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIcon() {
                this.icon_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUid() {
                return this.uid_;
            }
            
            public Builder setUid(final int value) {
                this.uid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUid() {
                this.uid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getPlayerName() {
                final Object ref = this.playerName_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.playerName_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getPlayerNameBytes() {
                final Object ref = this.playerName_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.playerName_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setPlayerName(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.playerName_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPlayerName() {
                this.playerName_ = FurnitureMakeBeHelpedData.getDefaultInstance().getPlayerName();
                this.onChanged();
                return this;
            }
            
            public Builder setPlayerNameBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.playerName_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasProfilePicture() {
                return this.profilePictureBuilder_ != null || this.profilePicture_ != null;
            }
            
            @Override
            public ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
                if (this.profilePictureBuilder_ == null) {
                    return (this.profilePicture_ == null) ? ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : this.profilePicture_;
                }
                return this.profilePictureBuilder_.getMessage();
            }
            
            public Builder setProfilePicture(final ProfilePictureOuterClass.ProfilePicture value) {
                if (this.profilePictureBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.profilePicture_ = value;
                    this.onChanged();
                }
                else {
                    this.profilePictureBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setProfilePicture(final ProfilePictureOuterClass.ProfilePicture.Builder builderForValue) {
                if (this.profilePictureBuilder_ == null) {
                    this.profilePicture_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.profilePictureBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeProfilePicture(final ProfilePictureOuterClass.ProfilePicture value) {
                if (this.profilePictureBuilder_ == null) {
                    if (this.profilePicture_ != null) {
                        this.profilePicture_ = ProfilePictureOuterClass.ProfilePicture.newBuilder(this.profilePicture_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.profilePicture_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.profilePictureBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearProfilePicture() {
                if (this.profilePictureBuilder_ == null) {
                    this.profilePicture_ = null;
                    this.onChanged();
                }
                else {
                    this.profilePicture_ = null;
                    this.profilePictureBuilder_ = null;
                }
                return this;
            }
            
            public ProfilePictureOuterClass.ProfilePicture.Builder getProfilePictureBuilder() {
                this.onChanged();
                return this.getProfilePictureFieldBuilder().getBuilder();
            }
            
            @Override
            public ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
                if (this.profilePictureBuilder_ != null) {
                    return this.profilePictureBuilder_.getMessageOrBuilder();
                }
                return (this.profilePicture_ == null) ? ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : this.profilePicture_;
            }
            
            private SingleFieldBuilderV3<ProfilePictureOuterClass.ProfilePicture, ProfilePictureOuterClass.ProfilePicture.Builder, ProfilePictureOuterClass.ProfilePictureOrBuilder> getProfilePictureFieldBuilder() {
                if (this.profilePictureBuilder_ == null) {
                    this.profilePictureBuilder_ = new SingleFieldBuilderV3<ProfilePictureOuterClass.ProfilePicture, ProfilePictureOuterClass.ProfilePicture.Builder, ProfilePictureOuterClass.ProfilePictureOrBuilder>(this.getProfilePicture(), this.getParentForChildren(), this.isClean());
                    this.profilePicture_ = null;
                }
                return this.profilePictureBuilder_;
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
    
    public interface FurnitureMakeBeHelpedDataOrBuilder extends MessageOrBuilder
    {
        int getTime();
        
        int getIcon();
        
        int getUid();
        
        String getPlayerName();
        
        ByteString getPlayerNameBytes();
        
        boolean hasProfilePicture();
        
        ProfilePictureOuterClass.ProfilePicture getProfilePicture();
        
        ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder();
    }
}
