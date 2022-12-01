// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SyncTeamEntityNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_SyncTeamEntityNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SyncTeamEntityNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SyncTeamEntityNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SyncTeamEntityNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aSyncTeamEntityNotify.proto\u001a\u0014TeamEntityInfo.proto\"X\n\u0014SyncTeamEntityNotify\u0012\u0010\n\bscene_id\u0018\r \u0001(\r\u0012.\n\u0015team_entity_info_list\u0018\u000f \u0003(\u000b2\u000f.TeamEntityInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SyncTeamEntityNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { TeamEntityInfoOuterClass.getDescriptor() });
        internal_static_SyncTeamEntityNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SyncTeamEntityNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SyncTeamEntityNotifyOuterClass.internal_static_SyncTeamEntityNotify_descriptor, new String[] { "SceneId", "TeamEntityInfoList" });
        TeamEntityInfoOuterClass.getDescriptor();
    }
    
    public static final class SyncTeamEntityNotify extends GeneratedMessageV3 implements SyncTeamEntityNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ID_FIELD_NUMBER = 13;
        private int sceneId_;
        public static final int TEAM_ENTITY_INFO_LIST_FIELD_NUMBER = 15;
        private List<TeamEntityInfoOuterClass.TeamEntityInfo> teamEntityInfoList_;
        private byte memoizedIsInitialized;
        private static final SyncTeamEntityNotify DEFAULT_INSTANCE;
        private static final Parser<SyncTeamEntityNotify> PARSER;
        
        private SyncTeamEntityNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SyncTeamEntityNotify() {
            this.memoizedIsInitialized = -1;
            this.teamEntityInfoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SyncTeamEntityNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SyncTeamEntityNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 104: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.teamEntityInfoList_ = new ArrayList<TeamEntityInfoOuterClass.TeamEntityInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.teamEntityInfoList_.add(input.readMessage(TeamEntityInfoOuterClass.TeamEntityInfo.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.teamEntityInfoList_ = Collections.unmodifiableList((List<? extends TeamEntityInfoOuterClass.TeamEntityInfo>)this.teamEntityInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SyncTeamEntityNotifyOuterClass.internal_static_SyncTeamEntityNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SyncTeamEntityNotifyOuterClass.internal_static_SyncTeamEntityNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncTeamEntityNotify.class, Builder.class);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
        }
        
        @Override
        public List<TeamEntityInfoOuterClass.TeamEntityInfo> getTeamEntityInfoListList() {
            return this.teamEntityInfoList_;
        }
        
        @Override
        public List<? extends TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder> getTeamEntityInfoListOrBuilderList() {
            return this.teamEntityInfoList_;
        }
        
        @Override
        public int getTeamEntityInfoListCount() {
            return this.teamEntityInfoList_.size();
        }
        
        @Override
        public TeamEntityInfoOuterClass.TeamEntityInfo getTeamEntityInfoList(final int index) {
            return this.teamEntityInfoList_.get(index);
        }
        
        @Override
        public TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder getTeamEntityInfoListOrBuilder(final int index) {
            return this.teamEntityInfoList_.get(index);
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
            if (this.sceneId_ != 0) {
                output.writeUInt32(13, this.sceneId_);
            }
            for (int i = 0; i < this.teamEntityInfoList_.size(); ++i) {
                output.writeMessage(15, this.teamEntityInfoList_.get(i));
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
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.sceneId_);
            }
            for (int i = 0; i < this.teamEntityInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(15, this.teamEntityInfoList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SyncTeamEntityNotify)) {
                return super.equals(obj);
            }
            final SyncTeamEntityNotify other = (SyncTeamEntityNotify)obj;
            return this.getSceneId() == other.getSceneId() && this.getTeamEntityInfoListList().equals(other.getTeamEntityInfoListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getSceneId();
            if (this.getTeamEntityInfoListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getTeamEntityInfoListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SyncTeamEntityNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SyncTeamEntityNotify.PARSER.parseFrom(data);
        }
        
        public static SyncTeamEntityNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SyncTeamEntityNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SyncTeamEntityNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SyncTeamEntityNotify.PARSER.parseFrom(data);
        }
        
        public static SyncTeamEntityNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SyncTeamEntityNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SyncTeamEntityNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SyncTeamEntityNotify.PARSER.parseFrom(data);
        }
        
        public static SyncTeamEntityNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SyncTeamEntityNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SyncTeamEntityNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SyncTeamEntityNotify.PARSER, input);
        }
        
        public static SyncTeamEntityNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SyncTeamEntityNotify.PARSER, input, extensionRegistry);
        }
        
        public static SyncTeamEntityNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SyncTeamEntityNotify.PARSER, input);
        }
        
        public static SyncTeamEntityNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SyncTeamEntityNotify.PARSER, input, extensionRegistry);
        }
        
        public static SyncTeamEntityNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SyncTeamEntityNotify.PARSER, input);
        }
        
        public static SyncTeamEntityNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SyncTeamEntityNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SyncTeamEntityNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SyncTeamEntityNotify prototype) {
            return SyncTeamEntityNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SyncTeamEntityNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SyncTeamEntityNotify getDefaultInstance() {
            return SyncTeamEntityNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<SyncTeamEntityNotify> parser() {
            return SyncTeamEntityNotify.PARSER;
        }
        
        @Override
        public Parser<SyncTeamEntityNotify> getParserForType() {
            return SyncTeamEntityNotify.PARSER;
        }
        
        @Override
        public SyncTeamEntityNotify getDefaultInstanceForType() {
            return SyncTeamEntityNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SyncTeamEntityNotify();
            PARSER = new AbstractParser<SyncTeamEntityNotify>() {
                @Override
                public SyncTeamEntityNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SyncTeamEntityNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SyncTeamEntityNotifyOrBuilder
        {
            private int bitField0_;
            private int sceneId_;
            private List<TeamEntityInfoOuterClass.TeamEntityInfo> teamEntityInfoList_;
            private RepeatedFieldBuilderV3<TeamEntityInfoOuterClass.TeamEntityInfo, TeamEntityInfoOuterClass.TeamEntityInfo.Builder, TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder> teamEntityInfoListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SyncTeamEntityNotifyOuterClass.internal_static_SyncTeamEntityNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SyncTeamEntityNotifyOuterClass.internal_static_SyncTeamEntityNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncTeamEntityNotify.class, Builder.class);
            }
            
            private Builder() {
                this.teamEntityInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.teamEntityInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SyncTeamEntityNotify.alwaysUseFieldBuilders) {
                    this.getTeamEntityInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneId_ = 0;
                if (this.teamEntityInfoListBuilder_ == null) {
                    this.teamEntityInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.teamEntityInfoListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SyncTeamEntityNotifyOuterClass.internal_static_SyncTeamEntityNotify_descriptor;
            }
            
            @Override
            public SyncTeamEntityNotify getDefaultInstanceForType() {
                return SyncTeamEntityNotify.getDefaultInstance();
            }
            
            @Override
            public SyncTeamEntityNotify build() {
                final SyncTeamEntityNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SyncTeamEntityNotify buildPartial() {
                final SyncTeamEntityNotify result = new SyncTeamEntityNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.sceneId_ = this.sceneId_;
                if (this.teamEntityInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.teamEntityInfoList_ = Collections.unmodifiableList((List<? extends TeamEntityInfoOuterClass.TeamEntityInfo>)this.teamEntityInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.teamEntityInfoList_ = this.teamEntityInfoList_;
                }
                else {
                    result.teamEntityInfoList_ = this.teamEntityInfoListBuilder_.build();
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
                if (other instanceof SyncTeamEntityNotify) {
                    return this.mergeFrom((SyncTeamEntityNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SyncTeamEntityNotify other) {
                if (other == SyncTeamEntityNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
                }
                if (this.teamEntityInfoListBuilder_ == null) {
                    if (!other.teamEntityInfoList_.isEmpty()) {
                        if (this.teamEntityInfoList_.isEmpty()) {
                            this.teamEntityInfoList_ = other.teamEntityInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureTeamEntityInfoListIsMutable();
                            this.teamEntityInfoList_.addAll(other.teamEntityInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.teamEntityInfoList_.isEmpty()) {
                    if (this.teamEntityInfoListBuilder_.isEmpty()) {
                        this.teamEntityInfoListBuilder_.dispose();
                        this.teamEntityInfoListBuilder_ = null;
                        this.teamEntityInfoList_ = other.teamEntityInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.teamEntityInfoListBuilder_ = (SyncTeamEntityNotify.alwaysUseFieldBuilders ? this.getTeamEntityInfoListFieldBuilder() : null);
                    }
                    else {
                        this.teamEntityInfoListBuilder_.addAllMessages(other.teamEntityInfoList_);
                    }
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
                SyncTeamEntityNotify parsedMessage = null;
                try {
                    parsedMessage = SyncTeamEntityNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SyncTeamEntityNotify)e.getUnfinishedMessage();
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
            
            private void ensureTeamEntityInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.teamEntityInfoList_ = new ArrayList<TeamEntityInfoOuterClass.TeamEntityInfo>(this.teamEntityInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<TeamEntityInfoOuterClass.TeamEntityInfo> getTeamEntityInfoListList() {
                if (this.teamEntityInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends TeamEntityInfoOuterClass.TeamEntityInfo>)this.teamEntityInfoList_);
                }
                return this.teamEntityInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getTeamEntityInfoListCount() {
                if (this.teamEntityInfoListBuilder_ == null) {
                    return this.teamEntityInfoList_.size();
                }
                return this.teamEntityInfoListBuilder_.getCount();
            }
            
            @Override
            public TeamEntityInfoOuterClass.TeamEntityInfo getTeamEntityInfoList(final int index) {
                if (this.teamEntityInfoListBuilder_ == null) {
                    return this.teamEntityInfoList_.get(index);
                }
                return this.teamEntityInfoListBuilder_.getMessage(index);
            }
            
            public Builder setTeamEntityInfoList(final int index, final TeamEntityInfoOuterClass.TeamEntityInfo value) {
                if (this.teamEntityInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTeamEntityInfoListIsMutable();
                    this.teamEntityInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.teamEntityInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setTeamEntityInfoList(final int index, final TeamEntityInfoOuterClass.TeamEntityInfo.Builder builderForValue) {
                if (this.teamEntityInfoListBuilder_ == null) {
                    this.ensureTeamEntityInfoListIsMutable();
                    this.teamEntityInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.teamEntityInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addTeamEntityInfoList(final TeamEntityInfoOuterClass.TeamEntityInfo value) {
                if (this.teamEntityInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTeamEntityInfoListIsMutable();
                    this.teamEntityInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.teamEntityInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addTeamEntityInfoList(final int index, final TeamEntityInfoOuterClass.TeamEntityInfo value) {
                if (this.teamEntityInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTeamEntityInfoListIsMutable();
                    this.teamEntityInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.teamEntityInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addTeamEntityInfoList(final TeamEntityInfoOuterClass.TeamEntityInfo.Builder builderForValue) {
                if (this.teamEntityInfoListBuilder_ == null) {
                    this.ensureTeamEntityInfoListIsMutable();
                    this.teamEntityInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.teamEntityInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addTeamEntityInfoList(final int index, final TeamEntityInfoOuterClass.TeamEntityInfo.Builder builderForValue) {
                if (this.teamEntityInfoListBuilder_ == null) {
                    this.ensureTeamEntityInfoListIsMutable();
                    this.teamEntityInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.teamEntityInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllTeamEntityInfoList(final Iterable<? extends TeamEntityInfoOuterClass.TeamEntityInfo> values) {
                if (this.teamEntityInfoListBuilder_ == null) {
                    this.ensureTeamEntityInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.teamEntityInfoList_);
                    this.onChanged();
                }
                else {
                    this.teamEntityInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearTeamEntityInfoList() {
                if (this.teamEntityInfoListBuilder_ == null) {
                    this.teamEntityInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.teamEntityInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeTeamEntityInfoList(final int index) {
                if (this.teamEntityInfoListBuilder_ == null) {
                    this.ensureTeamEntityInfoListIsMutable();
                    this.teamEntityInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.teamEntityInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public TeamEntityInfoOuterClass.TeamEntityInfo.Builder getTeamEntityInfoListBuilder(final int index) {
                return this.getTeamEntityInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder getTeamEntityInfoListOrBuilder(final int index) {
                if (this.teamEntityInfoListBuilder_ == null) {
                    return this.teamEntityInfoList_.get(index);
                }
                return this.teamEntityInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder> getTeamEntityInfoListOrBuilderList() {
                if (this.teamEntityInfoListBuilder_ != null) {
                    return this.teamEntityInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder>)this.teamEntityInfoList_);
            }
            
            public TeamEntityInfoOuterClass.TeamEntityInfo.Builder addTeamEntityInfoListBuilder() {
                return this.getTeamEntityInfoListFieldBuilder().addBuilder(TeamEntityInfoOuterClass.TeamEntityInfo.getDefaultInstance());
            }
            
            public TeamEntityInfoOuterClass.TeamEntityInfo.Builder addTeamEntityInfoListBuilder(final int index) {
                return this.getTeamEntityInfoListFieldBuilder().addBuilder(index, TeamEntityInfoOuterClass.TeamEntityInfo.getDefaultInstance());
            }
            
            public List<TeamEntityInfoOuterClass.TeamEntityInfo.Builder> getTeamEntityInfoListBuilderList() {
                return this.getTeamEntityInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<TeamEntityInfoOuterClass.TeamEntityInfo, TeamEntityInfoOuterClass.TeamEntityInfo.Builder, TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder> getTeamEntityInfoListFieldBuilder() {
                if (this.teamEntityInfoListBuilder_ == null) {
                    this.teamEntityInfoListBuilder_ = new RepeatedFieldBuilderV3<TeamEntityInfoOuterClass.TeamEntityInfo, TeamEntityInfoOuterClass.TeamEntityInfo.Builder, TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder>(this.teamEntityInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.teamEntityInfoList_ = null;
                }
                return this.teamEntityInfoListBuilder_;
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
    
    public interface SyncTeamEntityNotifyOrBuilder extends MessageOrBuilder
    {
        int getSceneId();
        
        List<TeamEntityInfoOuterClass.TeamEntityInfo> getTeamEntityInfoListList();
        
        TeamEntityInfoOuterClass.TeamEntityInfo getTeamEntityInfoList(final int p0);
        
        int getTeamEntityInfoListCount();
        
        List<? extends TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder> getTeamEntityInfoListOrBuilderList();
        
        TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder getTeamEntityInfoListOrBuilder(final int p0);
    }
}
