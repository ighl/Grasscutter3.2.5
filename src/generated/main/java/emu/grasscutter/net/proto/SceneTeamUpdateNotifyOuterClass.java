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
import com.google.protobuf.Internal;
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

public final class SceneTeamUpdateNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneTeamUpdateNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneTeamUpdateNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneTeamUpdateNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneTeamUpdateNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bSceneTeamUpdateNotify.proto\u001a\u0015SceneTeamAvatar.proto\"[\n\u0015SceneTeamUpdateNotify\u00120\n\u0016scene_team_avatar_list\u0018\u0005 \u0003(\u000b2\u0010.SceneTeamAvatar\u0012\u0010\n\bis_in_mp\u0018\t \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneTeamUpdateNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { SceneTeamAvatarOuterClass.getDescriptor() });
        internal_static_SceneTeamUpdateNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneTeamUpdateNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneTeamUpdateNotifyOuterClass.internal_static_SceneTeamUpdateNotify_descriptor, new String[] { "SceneTeamAvatarList", "IsInMp" });
        SceneTeamAvatarOuterClass.getDescriptor();
    }
    
    public static final class SceneTeamUpdateNotify extends GeneratedMessageV3 implements SceneTeamUpdateNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_TEAM_AVATAR_LIST_FIELD_NUMBER = 5;
        private List<SceneTeamAvatarOuterClass.SceneTeamAvatar> sceneTeamAvatarList_;
        public static final int IS_IN_MP_FIELD_NUMBER = 9;
        private boolean isInMp_;
        private byte memoizedIsInitialized;
        private static final SceneTeamUpdateNotify DEFAULT_INSTANCE;
        private static final Parser<SceneTeamUpdateNotify> PARSER;
        
        private SceneTeamUpdateNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneTeamUpdateNotify() {
            this.memoizedIsInitialized = -1;
            this.sceneTeamAvatarList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneTeamUpdateNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneTeamUpdateNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 42: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.sceneTeamAvatarList_ = new ArrayList<SceneTeamAvatarOuterClass.SceneTeamAvatar>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.sceneTeamAvatarList_.add(input.readMessage(SceneTeamAvatarOuterClass.SceneTeamAvatar.parser(), extensionRegistry));
                            continue;
                        }
                        case 72: {
                            this.isInMp_ = input.readBool();
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
                    this.sceneTeamAvatarList_ = Collections.unmodifiableList((List<? extends SceneTeamAvatarOuterClass.SceneTeamAvatar>)this.sceneTeamAvatarList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneTeamUpdateNotifyOuterClass.internal_static_SceneTeamUpdateNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneTeamUpdateNotifyOuterClass.internal_static_SceneTeamUpdateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneTeamUpdateNotify.class, Builder.class);
        }
        
        @Override
        public List<SceneTeamAvatarOuterClass.SceneTeamAvatar> getSceneTeamAvatarListList() {
            return this.sceneTeamAvatarList_;
        }
        
        @Override
        public List<? extends SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder> getSceneTeamAvatarListOrBuilderList() {
            return this.sceneTeamAvatarList_;
        }
        
        @Override
        public int getSceneTeamAvatarListCount() {
            return this.sceneTeamAvatarList_.size();
        }
        
        @Override
        public SceneTeamAvatarOuterClass.SceneTeamAvatar getSceneTeamAvatarList(final int index) {
            return this.sceneTeamAvatarList_.get(index);
        }
        
        @Override
        public SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder getSceneTeamAvatarListOrBuilder(final int index) {
            return this.sceneTeamAvatarList_.get(index);
        }
        
        @Override
        public boolean getIsInMp() {
            return this.isInMp_;
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
            for (int i = 0; i < this.sceneTeamAvatarList_.size(); ++i) {
                output.writeMessage(5, this.sceneTeamAvatarList_.get(i));
            }
            if (this.isInMp_) {
                output.writeBool(9, this.isInMp_);
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
            for (int i = 0; i < this.sceneTeamAvatarList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.sceneTeamAvatarList_.get(i));
            }
            if (this.isInMp_) {
                size += CodedOutputStream.computeBoolSize(9, this.isInMp_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneTeamUpdateNotify)) {
                return super.equals(obj);
            }
            final SceneTeamUpdateNotify other = (SceneTeamUpdateNotify)obj;
            return this.getSceneTeamAvatarListList().equals(other.getSceneTeamAvatarListList()) && this.getIsInMp() == other.getIsInMp() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getSceneTeamAvatarListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getSceneTeamAvatarListList().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashBoolean(this.getIsInMp());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneTeamUpdateNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneTeamUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static SceneTeamUpdateNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneTeamUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneTeamUpdateNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneTeamUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static SceneTeamUpdateNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneTeamUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneTeamUpdateNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneTeamUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static SceneTeamUpdateNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneTeamUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneTeamUpdateNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTeamUpdateNotify.PARSER, input);
        }
        
        public static SceneTeamUpdateNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTeamUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneTeamUpdateNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneTeamUpdateNotify.PARSER, input);
        }
        
        public static SceneTeamUpdateNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneTeamUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneTeamUpdateNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTeamUpdateNotify.PARSER, input);
        }
        
        public static SceneTeamUpdateNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneTeamUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneTeamUpdateNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneTeamUpdateNotify prototype) {
            return SceneTeamUpdateNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneTeamUpdateNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneTeamUpdateNotify getDefaultInstance() {
            return SceneTeamUpdateNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneTeamUpdateNotify> parser() {
            return SceneTeamUpdateNotify.PARSER;
        }
        
        @Override
        public Parser<SceneTeamUpdateNotify> getParserForType() {
            return SceneTeamUpdateNotify.PARSER;
        }
        
        @Override
        public SceneTeamUpdateNotify getDefaultInstanceForType() {
            return SceneTeamUpdateNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneTeamUpdateNotify();
            PARSER = new AbstractParser<SceneTeamUpdateNotify>() {
                @Override
                public SceneTeamUpdateNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneTeamUpdateNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneTeamUpdateNotifyOrBuilder
        {
            private int bitField0_;
            private List<SceneTeamAvatarOuterClass.SceneTeamAvatar> sceneTeamAvatarList_;
            private RepeatedFieldBuilderV3<SceneTeamAvatarOuterClass.SceneTeamAvatar, SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder, SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder> sceneTeamAvatarListBuilder_;
            private boolean isInMp_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneTeamUpdateNotifyOuterClass.internal_static_SceneTeamUpdateNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneTeamUpdateNotifyOuterClass.internal_static_SceneTeamUpdateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneTeamUpdateNotify.class, Builder.class);
            }
            
            private Builder() {
                this.sceneTeamAvatarList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.sceneTeamAvatarList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneTeamUpdateNotify.alwaysUseFieldBuilders) {
                    this.getSceneTeamAvatarListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    this.sceneTeamAvatarList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.sceneTeamAvatarListBuilder_.clear();
                }
                this.isInMp_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneTeamUpdateNotifyOuterClass.internal_static_SceneTeamUpdateNotify_descriptor;
            }
            
            @Override
            public SceneTeamUpdateNotify getDefaultInstanceForType() {
                return SceneTeamUpdateNotify.getDefaultInstance();
            }
            
            @Override
            public SceneTeamUpdateNotify build() {
                final SceneTeamUpdateNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneTeamUpdateNotify buildPartial() {
                final SceneTeamUpdateNotify result = new SceneTeamUpdateNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.sceneTeamAvatarList_ = Collections.unmodifiableList((List<? extends SceneTeamAvatarOuterClass.SceneTeamAvatar>)this.sceneTeamAvatarList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.sceneTeamAvatarList_ = this.sceneTeamAvatarList_;
                }
                else {
                    result.sceneTeamAvatarList_ = this.sceneTeamAvatarListBuilder_.build();
                }
                result.isInMp_ = this.isInMp_;
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
                if (other instanceof SceneTeamUpdateNotify) {
                    return this.mergeFrom((SceneTeamUpdateNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneTeamUpdateNotify other) {
                if (other == SceneTeamUpdateNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    if (!other.sceneTeamAvatarList_.isEmpty()) {
                        if (this.sceneTeamAvatarList_.isEmpty()) {
                            this.sceneTeamAvatarList_ = other.sceneTeamAvatarList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureSceneTeamAvatarListIsMutable();
                            this.sceneTeamAvatarList_.addAll(other.sceneTeamAvatarList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.sceneTeamAvatarList_.isEmpty()) {
                    if (this.sceneTeamAvatarListBuilder_.isEmpty()) {
                        this.sceneTeamAvatarListBuilder_.dispose();
                        this.sceneTeamAvatarListBuilder_ = null;
                        this.sceneTeamAvatarList_ = other.sceneTeamAvatarList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.sceneTeamAvatarListBuilder_ = (SceneTeamUpdateNotify.alwaysUseFieldBuilders ? this.getSceneTeamAvatarListFieldBuilder() : null);
                    }
                    else {
                        this.sceneTeamAvatarListBuilder_.addAllMessages(other.sceneTeamAvatarList_);
                    }
                }
                if (other.getIsInMp()) {
                    this.setIsInMp(other.getIsInMp());
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
                SceneTeamUpdateNotify parsedMessage = null;
                try {
                    parsedMessage = SceneTeamUpdateNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneTeamUpdateNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureSceneTeamAvatarListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.sceneTeamAvatarList_ = new ArrayList<SceneTeamAvatarOuterClass.SceneTeamAvatar>(this.sceneTeamAvatarList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<SceneTeamAvatarOuterClass.SceneTeamAvatar> getSceneTeamAvatarListList() {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends SceneTeamAvatarOuterClass.SceneTeamAvatar>)this.sceneTeamAvatarList_);
                }
                return this.sceneTeamAvatarListBuilder_.getMessageList();
            }
            
            @Override
            public int getSceneTeamAvatarListCount() {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    return this.sceneTeamAvatarList_.size();
                }
                return this.sceneTeamAvatarListBuilder_.getCount();
            }
            
            @Override
            public SceneTeamAvatarOuterClass.SceneTeamAvatar getSceneTeamAvatarList(final int index) {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    return this.sceneTeamAvatarList_.get(index);
                }
                return this.sceneTeamAvatarListBuilder_.getMessage(index);
            }
            
            public Builder setSceneTeamAvatarList(final int index, final SceneTeamAvatarOuterClass.SceneTeamAvatar value) {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSceneTeamAvatarListIsMutable();
                    this.sceneTeamAvatarList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.sceneTeamAvatarListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setSceneTeamAvatarList(final int index, final SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder builderForValue) {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    this.ensureSceneTeamAvatarListIsMutable();
                    this.sceneTeamAvatarList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.sceneTeamAvatarListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addSceneTeamAvatarList(final SceneTeamAvatarOuterClass.SceneTeamAvatar value) {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSceneTeamAvatarListIsMutable();
                    this.sceneTeamAvatarList_.add(value);
                    this.onChanged();
                }
                else {
                    this.sceneTeamAvatarListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addSceneTeamAvatarList(final int index, final SceneTeamAvatarOuterClass.SceneTeamAvatar value) {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSceneTeamAvatarListIsMutable();
                    this.sceneTeamAvatarList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.sceneTeamAvatarListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addSceneTeamAvatarList(final SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder builderForValue) {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    this.ensureSceneTeamAvatarListIsMutable();
                    this.sceneTeamAvatarList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.sceneTeamAvatarListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addSceneTeamAvatarList(final int index, final SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder builderForValue) {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    this.ensureSceneTeamAvatarListIsMutable();
                    this.sceneTeamAvatarList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.sceneTeamAvatarListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllSceneTeamAvatarList(final Iterable<? extends SceneTeamAvatarOuterClass.SceneTeamAvatar> values) {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    this.ensureSceneTeamAvatarListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.sceneTeamAvatarList_);
                    this.onChanged();
                }
                else {
                    this.sceneTeamAvatarListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearSceneTeamAvatarList() {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    this.sceneTeamAvatarList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.sceneTeamAvatarListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeSceneTeamAvatarList(final int index) {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    this.ensureSceneTeamAvatarListIsMutable();
                    this.sceneTeamAvatarList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.sceneTeamAvatarListBuilder_.remove(index);
                }
                return this;
            }
            
            public SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder getSceneTeamAvatarListBuilder(final int index) {
                return this.getSceneTeamAvatarListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder getSceneTeamAvatarListOrBuilder(final int index) {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    return this.sceneTeamAvatarList_.get(index);
                }
                return this.sceneTeamAvatarListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder> getSceneTeamAvatarListOrBuilderList() {
                if (this.sceneTeamAvatarListBuilder_ != null) {
                    return this.sceneTeamAvatarListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder>)this.sceneTeamAvatarList_);
            }
            
            public SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder addSceneTeamAvatarListBuilder() {
                return this.getSceneTeamAvatarListFieldBuilder().addBuilder(SceneTeamAvatarOuterClass.SceneTeamAvatar.getDefaultInstance());
            }
            
            public SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder addSceneTeamAvatarListBuilder(final int index) {
                return this.getSceneTeamAvatarListFieldBuilder().addBuilder(index, SceneTeamAvatarOuterClass.SceneTeamAvatar.getDefaultInstance());
            }
            
            public List<SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder> getSceneTeamAvatarListBuilderList() {
                return this.getSceneTeamAvatarListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<SceneTeamAvatarOuterClass.SceneTeamAvatar, SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder, SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder> getSceneTeamAvatarListFieldBuilder() {
                if (this.sceneTeamAvatarListBuilder_ == null) {
                    this.sceneTeamAvatarListBuilder_ = new RepeatedFieldBuilderV3<SceneTeamAvatarOuterClass.SceneTeamAvatar, SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder, SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder>(this.sceneTeamAvatarList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.sceneTeamAvatarList_ = null;
                }
                return this.sceneTeamAvatarListBuilder_;
            }
            
            @Override
            public boolean getIsInMp() {
                return this.isInMp_;
            }
            
            public Builder setIsInMp(final boolean value) {
                this.isInMp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsInMp() {
                this.isInMp_ = false;
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
    
    public interface SceneTeamUpdateNotifyOrBuilder extends MessageOrBuilder
    {
        List<SceneTeamAvatarOuterClass.SceneTeamAvatar> getSceneTeamAvatarListList();
        
        SceneTeamAvatarOuterClass.SceneTeamAvatar getSceneTeamAvatarList(final int p0);
        
        int getSceneTeamAvatarListCount();
        
        List<? extends SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder> getSceneTeamAvatarListOrBuilderList();
        
        SceneTeamAvatarOuterClass.SceneTeamAvatarOrBuilder getSceneTeamAvatarListOrBuilder(final int p0);
        
        boolean getIsInMp();
    }
}
