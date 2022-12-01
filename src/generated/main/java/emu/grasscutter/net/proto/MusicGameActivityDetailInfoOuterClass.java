// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class MusicGameActivityDetailInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameActivityDetailInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameActivityDetailInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_MusicGameActivityDetailInfo_MusicGameRecordMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameActivityDetailInfo_MusicGameRecordMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameActivityDetailInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameActivityDetailInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!MusicGameActivityDetailInfo.proto\u001a\u0014MusicBriefInfo.proto\u001a\u0015MusicGameRecord.proto\"\u009f\u0002\n\u001bMusicGameActivityDetailInfo\u0012.\n\u0015others_custom_beatmap\u0018\u0004 \u0003(\u000b2\u000f.MusicBriefInfo\u0012.\n\u0015person_custom_beatmap\u0018\u0007 \u0003(\u000b2\u000f.MusicBriefInfo\u0012S\n\u0015music_game_record_map\u0018\b \u0003(\u000b24.MusicGameActivityDetailInfo.MusicGameRecordMapEntry\u001aK\n\u0017MusicGameRecordMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u001f\n\u0005value\u0018\u0002 \u0001(\u000b2\u0010.MusicGameRecord:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameActivityDetailInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MusicBriefInfoOuterClass.getDescriptor(), MusicGameRecordOuterClass.getDescriptor() });
        internal_static_MusicGameActivityDetailInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameActivityDetailInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameActivityDetailInfoOuterClass.internal_static_MusicGameActivityDetailInfo_descriptor, new String[] { "OthersCustomBeatmap", "PersonCustomBeatmap", "MusicGameRecordMap" });
        internal_static_MusicGameActivityDetailInfo_MusicGameRecordMapEntry_descriptor = MusicGameActivityDetailInfoOuterClass.internal_static_MusicGameActivityDetailInfo_descriptor.getNestedTypes().get(0);
        internal_static_MusicGameActivityDetailInfo_MusicGameRecordMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameActivityDetailInfoOuterClass.internal_static_MusicGameActivityDetailInfo_MusicGameRecordMapEntry_descriptor, new String[] { "Key", "Value" });
        MusicBriefInfoOuterClass.getDescriptor();
        MusicGameRecordOuterClass.getDescriptor();
    }
    
    public static final class MusicGameActivityDetailInfo extends GeneratedMessageV3 implements MusicGameActivityDetailInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int OTHERS_CUSTOM_BEATMAP_FIELD_NUMBER = 4;
        private List<MusicBriefInfoOuterClass.MusicBriefInfo> othersCustomBeatmap_;
        public static final int PERSON_CUSTOM_BEATMAP_FIELD_NUMBER = 7;
        private List<MusicBriefInfoOuterClass.MusicBriefInfo> personCustomBeatmap_;
        public static final int MUSIC_GAME_RECORD_MAP_FIELD_NUMBER = 8;
        private MapField<Integer, MusicGameRecordOuterClass.MusicGameRecord> musicGameRecordMap_;
        private byte memoizedIsInitialized;
        private static final MusicGameActivityDetailInfo DEFAULT_INSTANCE;
        private static final Parser<MusicGameActivityDetailInfo> PARSER;
        
        private MusicGameActivityDetailInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameActivityDetailInfo() {
            this.memoizedIsInitialized = -1;
            this.othersCustomBeatmap_ = Collections.emptyList();
            this.personCustomBeatmap_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameActivityDetailInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameActivityDetailInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 34: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.othersCustomBeatmap_ = new ArrayList<MusicBriefInfoOuterClass.MusicBriefInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.othersCustomBeatmap_.add(input.readMessage(MusicBriefInfoOuterClass.MusicBriefInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 58: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.personCustomBeatmap_ = new ArrayList<MusicBriefInfoOuterClass.MusicBriefInfo>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.personCustomBeatmap_.add(input.readMessage(MusicBriefInfoOuterClass.MusicBriefInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 66: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.musicGameRecordMap_ = MapField.newMapField(MusicGameRecordMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x4;
                            }
                            final MapEntry<Integer, MusicGameRecordOuterClass.MusicGameRecord> musicGameRecordMap__ = input.readMessage(MusicGameRecordMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.musicGameRecordMap_.getMutableMap().put(musicGameRecordMap__.getKey(), musicGameRecordMap__.getValue());
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
                    this.othersCustomBeatmap_ = Collections.unmodifiableList((List<? extends MusicBriefInfoOuterClass.MusicBriefInfo>)this.othersCustomBeatmap_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.personCustomBeatmap_ = Collections.unmodifiableList((List<? extends MusicBriefInfoOuterClass.MusicBriefInfo>)this.personCustomBeatmap_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MusicGameActivityDetailInfoOuterClass.internal_static_MusicGameActivityDetailInfo_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 8: {
                    return this.internalGetMusicGameRecordMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameActivityDetailInfoOuterClass.internal_static_MusicGameActivityDetailInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameActivityDetailInfo.class, Builder.class);
        }
        
        @Override
        public List<MusicBriefInfoOuterClass.MusicBriefInfo> getOthersCustomBeatmapList() {
            return this.othersCustomBeatmap_;
        }
        
        @Override
        public List<? extends MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> getOthersCustomBeatmapOrBuilderList() {
            return this.othersCustomBeatmap_;
        }
        
        @Override
        public int getOthersCustomBeatmapCount() {
            return this.othersCustomBeatmap_.size();
        }
        
        @Override
        public MusicBriefInfoOuterClass.MusicBriefInfo getOthersCustomBeatmap(final int index) {
            return this.othersCustomBeatmap_.get(index);
        }
        
        @Override
        public MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getOthersCustomBeatmapOrBuilder(final int index) {
            return this.othersCustomBeatmap_.get(index);
        }
        
        @Override
        public List<MusicBriefInfoOuterClass.MusicBriefInfo> getPersonCustomBeatmapList() {
            return this.personCustomBeatmap_;
        }
        
        @Override
        public List<? extends MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> getPersonCustomBeatmapOrBuilderList() {
            return this.personCustomBeatmap_;
        }
        
        @Override
        public int getPersonCustomBeatmapCount() {
            return this.personCustomBeatmap_.size();
        }
        
        @Override
        public MusicBriefInfoOuterClass.MusicBriefInfo getPersonCustomBeatmap(final int index) {
            return this.personCustomBeatmap_.get(index);
        }
        
        @Override
        public MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getPersonCustomBeatmapOrBuilder(final int index) {
            return this.personCustomBeatmap_.get(index);
        }
        
        private MapField<Integer, MusicGameRecordOuterClass.MusicGameRecord> internalGetMusicGameRecordMap() {
            if (this.musicGameRecordMap_ == null) {
                return MapField.emptyMapField(MusicGameRecordMapDefaultEntryHolder.defaultEntry);
            }
            return this.musicGameRecordMap_;
        }
        
        @Override
        public int getMusicGameRecordMapCount() {
            return this.internalGetMusicGameRecordMap().getMap().size();
        }
        
        @Override
        public boolean containsMusicGameRecordMap(final int key) {
            return this.internalGetMusicGameRecordMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, MusicGameRecordOuterClass.MusicGameRecord> getMusicGameRecordMap() {
            return this.getMusicGameRecordMapMap();
        }
        
        @Override
        public Map<Integer, MusicGameRecordOuterClass.MusicGameRecord> getMusicGameRecordMapMap() {
            return this.internalGetMusicGameRecordMap().getMap();
        }
        
        @Override
        public MusicGameRecordOuterClass.MusicGameRecord getMusicGameRecordMapOrDefault(final int key, final MusicGameRecordOuterClass.MusicGameRecord defaultValue) {
            final Map<Integer, MusicGameRecordOuterClass.MusicGameRecord> map = this.internalGetMusicGameRecordMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public MusicGameRecordOuterClass.MusicGameRecord getMusicGameRecordMapOrThrow(final int key) {
            final Map<Integer, MusicGameRecordOuterClass.MusicGameRecord> map = this.internalGetMusicGameRecordMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
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
            for (int i = 0; i < this.othersCustomBeatmap_.size(); ++i) {
                output.writeMessage(4, this.othersCustomBeatmap_.get(i));
            }
            for (int i = 0; i < this.personCustomBeatmap_.size(); ++i) {
                output.writeMessage(7, this.personCustomBeatmap_.get(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetMusicGameRecordMap(), MusicGameRecordMapDefaultEntryHolder.defaultEntry, 8);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            for (int i = 0; i < this.othersCustomBeatmap_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(4, this.othersCustomBeatmap_.get(i));
            }
            for (int i = 0; i < this.personCustomBeatmap_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(7, this.personCustomBeatmap_.get(i));
            }
            for (final Map.Entry<Integer, MusicGameRecordOuterClass.MusicGameRecord> entry : this.internalGetMusicGameRecordMap().getMap().entrySet()) {
                final MapEntry<Integer, MusicGameRecordOuterClass.MusicGameRecord> musicGameRecordMap__ = MusicGameRecordMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(8, musicGameRecordMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicGameActivityDetailInfo)) {
                return super.equals(obj);
            }
            final MusicGameActivityDetailInfo other = (MusicGameActivityDetailInfo)obj;
            return this.getOthersCustomBeatmapList().equals(other.getOthersCustomBeatmapList()) && this.getPersonCustomBeatmapList().equals(other.getPersonCustomBeatmapList()) && this.internalGetMusicGameRecordMap().equals(other.internalGetMusicGameRecordMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getOthersCustomBeatmapCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getOthersCustomBeatmapList().hashCode();
            }
            if (this.getPersonCustomBeatmapCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getPersonCustomBeatmapList().hashCode();
            }
            if (!this.internalGetMusicGameRecordMap().getMap().isEmpty()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.internalGetMusicGameRecordMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameActivityDetailInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameActivityDetailInfo.PARSER.parseFrom(data);
        }
        
        public static MusicGameActivityDetailInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameActivityDetailInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameActivityDetailInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameActivityDetailInfo.PARSER.parseFrom(data);
        }
        
        public static MusicGameActivityDetailInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameActivityDetailInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameActivityDetailInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameActivityDetailInfo.PARSER.parseFrom(data);
        }
        
        public static MusicGameActivityDetailInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameActivityDetailInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameActivityDetailInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameActivityDetailInfo.PARSER, input);
        }
        
        public static MusicGameActivityDetailInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameActivityDetailInfo.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameActivityDetailInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameActivityDetailInfo.PARSER, input);
        }
        
        public static MusicGameActivityDetailInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameActivityDetailInfo.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameActivityDetailInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameActivityDetailInfo.PARSER, input);
        }
        
        public static MusicGameActivityDetailInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameActivityDetailInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameActivityDetailInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameActivityDetailInfo prototype) {
            return MusicGameActivityDetailInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameActivityDetailInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameActivityDetailInfo getDefaultInstance() {
            return MusicGameActivityDetailInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameActivityDetailInfo> parser() {
            return MusicGameActivityDetailInfo.PARSER;
        }
        
        @Override
        public Parser<MusicGameActivityDetailInfo> getParserForType() {
            return MusicGameActivityDetailInfo.PARSER;
        }
        
        @Override
        public MusicGameActivityDetailInfo getDefaultInstanceForType() {
            return MusicGameActivityDetailInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameActivityDetailInfo();
            PARSER = new AbstractParser<MusicGameActivityDetailInfo>() {
                @Override
                public MusicGameActivityDetailInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameActivityDetailInfo(input, extensionRegistry);
                }
            };
        }
        
        private static final class MusicGameRecordMapDefaultEntryHolder
        {
            static final MapEntry<Integer, MusicGameRecordOuterClass.MusicGameRecord> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(MusicGameActivityDetailInfoOuterClass.internal_static_MusicGameActivityDetailInfo_MusicGameRecordMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, MusicGameRecordOuterClass.MusicGameRecord.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameActivityDetailInfoOrBuilder
        {
            private int bitField0_;
            private List<MusicBriefInfoOuterClass.MusicBriefInfo> othersCustomBeatmap_;
            private RepeatedFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> othersCustomBeatmapBuilder_;
            private List<MusicBriefInfoOuterClass.MusicBriefInfo> personCustomBeatmap_;
            private RepeatedFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> personCustomBeatmapBuilder_;
            private MapField<Integer, MusicGameRecordOuterClass.MusicGameRecord> musicGameRecordMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameActivityDetailInfoOuterClass.internal_static_MusicGameActivityDetailInfo_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 8: {
                        return this.internalGetMusicGameRecordMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 8: {
                        return this.internalGetMutableMusicGameRecordMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameActivityDetailInfoOuterClass.internal_static_MusicGameActivityDetailInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameActivityDetailInfo.class, Builder.class);
            }
            
            private Builder() {
                this.othersCustomBeatmap_ = Collections.emptyList();
                this.personCustomBeatmap_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.othersCustomBeatmap_ = Collections.emptyList();
                this.personCustomBeatmap_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicGameActivityDetailInfo.alwaysUseFieldBuilders) {
                    this.getOthersCustomBeatmapFieldBuilder();
                    this.getPersonCustomBeatmapFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.othersCustomBeatmapBuilder_ == null) {
                    this.othersCustomBeatmap_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.othersCustomBeatmapBuilder_.clear();
                }
                if (this.personCustomBeatmapBuilder_ == null) {
                    this.personCustomBeatmap_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.personCustomBeatmapBuilder_.clear();
                }
                this.internalGetMutableMusicGameRecordMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameActivityDetailInfoOuterClass.internal_static_MusicGameActivityDetailInfo_descriptor;
            }
            
            @Override
            public MusicGameActivityDetailInfo getDefaultInstanceForType() {
                return MusicGameActivityDetailInfo.getDefaultInstance();
            }
            
            @Override
            public MusicGameActivityDetailInfo build() {
                final MusicGameActivityDetailInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameActivityDetailInfo buildPartial() {
                final MusicGameActivityDetailInfo result = new MusicGameActivityDetailInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.othersCustomBeatmapBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.othersCustomBeatmap_ = Collections.unmodifiableList((List<? extends MusicBriefInfoOuterClass.MusicBriefInfo>)this.othersCustomBeatmap_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.othersCustomBeatmap_ = this.othersCustomBeatmap_;
                }
                else {
                    result.othersCustomBeatmap_ = this.othersCustomBeatmapBuilder_.build();
                }
                if (this.personCustomBeatmapBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.personCustomBeatmap_ = Collections.unmodifiableList((List<? extends MusicBriefInfoOuterClass.MusicBriefInfo>)this.personCustomBeatmap_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.personCustomBeatmap_ = this.personCustomBeatmap_;
                }
                else {
                    result.personCustomBeatmap_ = this.personCustomBeatmapBuilder_.build();
                }
                (result.musicGameRecordMap_ = this.internalGetMusicGameRecordMap()).makeImmutable();
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
                if (other instanceof MusicGameActivityDetailInfo) {
                    return this.mergeFrom((MusicGameActivityDetailInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameActivityDetailInfo other) {
                if (other == MusicGameActivityDetailInfo.getDefaultInstance()) {
                    return this;
                }
                if (this.othersCustomBeatmapBuilder_ == null) {
                    if (!other.othersCustomBeatmap_.isEmpty()) {
                        if (this.othersCustomBeatmap_.isEmpty()) {
                            this.othersCustomBeatmap_ = other.othersCustomBeatmap_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureOthersCustomBeatmapIsMutable();
                            this.othersCustomBeatmap_.addAll(other.othersCustomBeatmap_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.othersCustomBeatmap_.isEmpty()) {
                    if (this.othersCustomBeatmapBuilder_.isEmpty()) {
                        this.othersCustomBeatmapBuilder_.dispose();
                        this.othersCustomBeatmapBuilder_ = null;
                        this.othersCustomBeatmap_ = other.othersCustomBeatmap_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.othersCustomBeatmapBuilder_ = (MusicGameActivityDetailInfo.alwaysUseFieldBuilders ? this.getOthersCustomBeatmapFieldBuilder() : null);
                    }
                    else {
                        this.othersCustomBeatmapBuilder_.addAllMessages(other.othersCustomBeatmap_);
                    }
                }
                if (this.personCustomBeatmapBuilder_ == null) {
                    if (!other.personCustomBeatmap_.isEmpty()) {
                        if (this.personCustomBeatmap_.isEmpty()) {
                            this.personCustomBeatmap_ = other.personCustomBeatmap_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensurePersonCustomBeatmapIsMutable();
                            this.personCustomBeatmap_.addAll(other.personCustomBeatmap_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.personCustomBeatmap_.isEmpty()) {
                    if (this.personCustomBeatmapBuilder_.isEmpty()) {
                        this.personCustomBeatmapBuilder_.dispose();
                        this.personCustomBeatmapBuilder_ = null;
                        this.personCustomBeatmap_ = other.personCustomBeatmap_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.personCustomBeatmapBuilder_ = (MusicGameActivityDetailInfo.alwaysUseFieldBuilders ? this.getPersonCustomBeatmapFieldBuilder() : null);
                    }
                    else {
                        this.personCustomBeatmapBuilder_.addAllMessages(other.personCustomBeatmap_);
                    }
                }
                this.internalGetMutableMusicGameRecordMap().mergeFrom(other.internalGetMusicGameRecordMap());
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
                MusicGameActivityDetailInfo parsedMessage = null;
                try {
                    parsedMessage = MusicGameActivityDetailInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameActivityDetailInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureOthersCustomBeatmapIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.othersCustomBeatmap_ = new ArrayList<MusicBriefInfoOuterClass.MusicBriefInfo>(this.othersCustomBeatmap_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<MusicBriefInfoOuterClass.MusicBriefInfo> getOthersCustomBeatmapList() {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends MusicBriefInfoOuterClass.MusicBriefInfo>)this.othersCustomBeatmap_);
                }
                return this.othersCustomBeatmapBuilder_.getMessageList();
            }
            
            @Override
            public int getOthersCustomBeatmapCount() {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    return this.othersCustomBeatmap_.size();
                }
                return this.othersCustomBeatmapBuilder_.getCount();
            }
            
            @Override
            public MusicBriefInfoOuterClass.MusicBriefInfo getOthersCustomBeatmap(final int index) {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    return this.othersCustomBeatmap_.get(index);
                }
                return this.othersCustomBeatmapBuilder_.getMessage(index);
            }
            
            public Builder setOthersCustomBeatmap(final int index, final MusicBriefInfoOuterClass.MusicBriefInfo value) {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOthersCustomBeatmapIsMutable();
                    this.othersCustomBeatmap_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.othersCustomBeatmapBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setOthersCustomBeatmap(final int index, final MusicBriefInfoOuterClass.MusicBriefInfo.Builder builderForValue) {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    this.ensureOthersCustomBeatmapIsMutable();
                    this.othersCustomBeatmap_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.othersCustomBeatmapBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addOthersCustomBeatmap(final MusicBriefInfoOuterClass.MusicBriefInfo value) {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOthersCustomBeatmapIsMutable();
                    this.othersCustomBeatmap_.add(value);
                    this.onChanged();
                }
                else {
                    this.othersCustomBeatmapBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addOthersCustomBeatmap(final int index, final MusicBriefInfoOuterClass.MusicBriefInfo value) {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOthersCustomBeatmapIsMutable();
                    this.othersCustomBeatmap_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.othersCustomBeatmapBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addOthersCustomBeatmap(final MusicBriefInfoOuterClass.MusicBriefInfo.Builder builderForValue) {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    this.ensureOthersCustomBeatmapIsMutable();
                    this.othersCustomBeatmap_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.othersCustomBeatmapBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addOthersCustomBeatmap(final int index, final MusicBriefInfoOuterClass.MusicBriefInfo.Builder builderForValue) {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    this.ensureOthersCustomBeatmapIsMutable();
                    this.othersCustomBeatmap_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.othersCustomBeatmapBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllOthersCustomBeatmap(final Iterable<? extends MusicBriefInfoOuterClass.MusicBriefInfo> values) {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    this.ensureOthersCustomBeatmapIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.othersCustomBeatmap_);
                    this.onChanged();
                }
                else {
                    this.othersCustomBeatmapBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearOthersCustomBeatmap() {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    this.othersCustomBeatmap_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.othersCustomBeatmapBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeOthersCustomBeatmap(final int index) {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    this.ensureOthersCustomBeatmapIsMutable();
                    this.othersCustomBeatmap_.remove(index);
                    this.onChanged();
                }
                else {
                    this.othersCustomBeatmapBuilder_.remove(index);
                }
                return this;
            }
            
            public MusicBriefInfoOuterClass.MusicBriefInfo.Builder getOthersCustomBeatmapBuilder(final int index) {
                return this.getOthersCustomBeatmapFieldBuilder().getBuilder(index);
            }
            
            @Override
            public MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getOthersCustomBeatmapOrBuilder(final int index) {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    return this.othersCustomBeatmap_.get(index);
                }
                return this.othersCustomBeatmapBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> getOthersCustomBeatmapOrBuilderList() {
                if (this.othersCustomBeatmapBuilder_ != null) {
                    return this.othersCustomBeatmapBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder>)this.othersCustomBeatmap_);
            }
            
            public MusicBriefInfoOuterClass.MusicBriefInfo.Builder addOthersCustomBeatmapBuilder() {
                return this.getOthersCustomBeatmapFieldBuilder().addBuilder(MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance());
            }
            
            public MusicBriefInfoOuterClass.MusicBriefInfo.Builder addOthersCustomBeatmapBuilder(final int index) {
                return this.getOthersCustomBeatmapFieldBuilder().addBuilder(index, MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance());
            }
            
            public List<MusicBriefInfoOuterClass.MusicBriefInfo.Builder> getOthersCustomBeatmapBuilderList() {
                return this.getOthersCustomBeatmapFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> getOthersCustomBeatmapFieldBuilder() {
                if (this.othersCustomBeatmapBuilder_ == null) {
                    this.othersCustomBeatmapBuilder_ = new RepeatedFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder>(this.othersCustomBeatmap_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.othersCustomBeatmap_ = null;
                }
                return this.othersCustomBeatmapBuilder_;
            }
            
            private void ensurePersonCustomBeatmapIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.personCustomBeatmap_ = new ArrayList<MusicBriefInfoOuterClass.MusicBriefInfo>(this.personCustomBeatmap_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<MusicBriefInfoOuterClass.MusicBriefInfo> getPersonCustomBeatmapList() {
                if (this.personCustomBeatmapBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends MusicBriefInfoOuterClass.MusicBriefInfo>)this.personCustomBeatmap_);
                }
                return this.personCustomBeatmapBuilder_.getMessageList();
            }
            
            @Override
            public int getPersonCustomBeatmapCount() {
                if (this.personCustomBeatmapBuilder_ == null) {
                    return this.personCustomBeatmap_.size();
                }
                return this.personCustomBeatmapBuilder_.getCount();
            }
            
            @Override
            public MusicBriefInfoOuterClass.MusicBriefInfo getPersonCustomBeatmap(final int index) {
                if (this.personCustomBeatmapBuilder_ == null) {
                    return this.personCustomBeatmap_.get(index);
                }
                return this.personCustomBeatmapBuilder_.getMessage(index);
            }
            
            public Builder setPersonCustomBeatmap(final int index, final MusicBriefInfoOuterClass.MusicBriefInfo value) {
                if (this.personCustomBeatmapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePersonCustomBeatmapIsMutable();
                    this.personCustomBeatmap_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.personCustomBeatmapBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPersonCustomBeatmap(final int index, final MusicBriefInfoOuterClass.MusicBriefInfo.Builder builderForValue) {
                if (this.personCustomBeatmapBuilder_ == null) {
                    this.ensurePersonCustomBeatmapIsMutable();
                    this.personCustomBeatmap_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.personCustomBeatmapBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPersonCustomBeatmap(final MusicBriefInfoOuterClass.MusicBriefInfo value) {
                if (this.personCustomBeatmapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePersonCustomBeatmapIsMutable();
                    this.personCustomBeatmap_.add(value);
                    this.onChanged();
                }
                else {
                    this.personCustomBeatmapBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPersonCustomBeatmap(final int index, final MusicBriefInfoOuterClass.MusicBriefInfo value) {
                if (this.personCustomBeatmapBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePersonCustomBeatmapIsMutable();
                    this.personCustomBeatmap_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.personCustomBeatmapBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPersonCustomBeatmap(final MusicBriefInfoOuterClass.MusicBriefInfo.Builder builderForValue) {
                if (this.personCustomBeatmapBuilder_ == null) {
                    this.ensurePersonCustomBeatmapIsMutable();
                    this.personCustomBeatmap_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.personCustomBeatmapBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPersonCustomBeatmap(final int index, final MusicBriefInfoOuterClass.MusicBriefInfo.Builder builderForValue) {
                if (this.personCustomBeatmapBuilder_ == null) {
                    this.ensurePersonCustomBeatmapIsMutable();
                    this.personCustomBeatmap_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.personCustomBeatmapBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPersonCustomBeatmap(final Iterable<? extends MusicBriefInfoOuterClass.MusicBriefInfo> values) {
                if (this.personCustomBeatmapBuilder_ == null) {
                    this.ensurePersonCustomBeatmapIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.personCustomBeatmap_);
                    this.onChanged();
                }
                else {
                    this.personCustomBeatmapBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPersonCustomBeatmap() {
                if (this.personCustomBeatmapBuilder_ == null) {
                    this.personCustomBeatmap_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.personCustomBeatmapBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePersonCustomBeatmap(final int index) {
                if (this.personCustomBeatmapBuilder_ == null) {
                    this.ensurePersonCustomBeatmapIsMutable();
                    this.personCustomBeatmap_.remove(index);
                    this.onChanged();
                }
                else {
                    this.personCustomBeatmapBuilder_.remove(index);
                }
                return this;
            }
            
            public MusicBriefInfoOuterClass.MusicBriefInfo.Builder getPersonCustomBeatmapBuilder(final int index) {
                return this.getPersonCustomBeatmapFieldBuilder().getBuilder(index);
            }
            
            @Override
            public MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getPersonCustomBeatmapOrBuilder(final int index) {
                if (this.personCustomBeatmapBuilder_ == null) {
                    return this.personCustomBeatmap_.get(index);
                }
                return this.personCustomBeatmapBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> getPersonCustomBeatmapOrBuilderList() {
                if (this.personCustomBeatmapBuilder_ != null) {
                    return this.personCustomBeatmapBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder>)this.personCustomBeatmap_);
            }
            
            public MusicBriefInfoOuterClass.MusicBriefInfo.Builder addPersonCustomBeatmapBuilder() {
                return this.getPersonCustomBeatmapFieldBuilder().addBuilder(MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance());
            }
            
            public MusicBriefInfoOuterClass.MusicBriefInfo.Builder addPersonCustomBeatmapBuilder(final int index) {
                return this.getPersonCustomBeatmapFieldBuilder().addBuilder(index, MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance());
            }
            
            public List<MusicBriefInfoOuterClass.MusicBriefInfo.Builder> getPersonCustomBeatmapBuilderList() {
                return this.getPersonCustomBeatmapFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> getPersonCustomBeatmapFieldBuilder() {
                if (this.personCustomBeatmapBuilder_ == null) {
                    this.personCustomBeatmapBuilder_ = new RepeatedFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder>(this.personCustomBeatmap_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.personCustomBeatmap_ = null;
                }
                return this.personCustomBeatmapBuilder_;
            }
            
            private MapField<Integer, MusicGameRecordOuterClass.MusicGameRecord> internalGetMusicGameRecordMap() {
                if (this.musicGameRecordMap_ == null) {
                    return MapField.emptyMapField(MusicGameRecordMapDefaultEntryHolder.defaultEntry);
                }
                return this.musicGameRecordMap_;
            }
            
            private MapField<Integer, MusicGameRecordOuterClass.MusicGameRecord> internalGetMutableMusicGameRecordMap() {
                this.onChanged();
                if (this.musicGameRecordMap_ == null) {
                    this.musicGameRecordMap_ = MapField.newMapField(MusicGameRecordMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.musicGameRecordMap_.isMutable()) {
                    this.musicGameRecordMap_ = this.musicGameRecordMap_.copy();
                }
                return this.musicGameRecordMap_;
            }
            
            @Override
            public int getMusicGameRecordMapCount() {
                return this.internalGetMusicGameRecordMap().getMap().size();
            }
            
            @Override
            public boolean containsMusicGameRecordMap(final int key) {
                return this.internalGetMusicGameRecordMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, MusicGameRecordOuterClass.MusicGameRecord> getMusicGameRecordMap() {
                return this.getMusicGameRecordMapMap();
            }
            
            @Override
            public Map<Integer, MusicGameRecordOuterClass.MusicGameRecord> getMusicGameRecordMapMap() {
                return this.internalGetMusicGameRecordMap().getMap();
            }
            
            @Override
            public MusicGameRecordOuterClass.MusicGameRecord getMusicGameRecordMapOrDefault(final int key, final MusicGameRecordOuterClass.MusicGameRecord defaultValue) {
                final Map<Integer, MusicGameRecordOuterClass.MusicGameRecord> map = this.internalGetMusicGameRecordMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public MusicGameRecordOuterClass.MusicGameRecord getMusicGameRecordMapOrThrow(final int key) {
                final Map<Integer, MusicGameRecordOuterClass.MusicGameRecord> map = this.internalGetMusicGameRecordMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearMusicGameRecordMap() {
                this.internalGetMutableMusicGameRecordMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeMusicGameRecordMap(final int key) {
                this.internalGetMutableMusicGameRecordMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, MusicGameRecordOuterClass.MusicGameRecord> getMutableMusicGameRecordMap() {
                return this.internalGetMutableMusicGameRecordMap().getMutableMap();
            }
            
            public Builder putMusicGameRecordMap(final int key, final MusicGameRecordOuterClass.MusicGameRecord value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableMusicGameRecordMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllMusicGameRecordMap(final Map<Integer, MusicGameRecordOuterClass.MusicGameRecord> values) {
                this.internalGetMutableMusicGameRecordMap().getMutableMap().putAll(values);
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
    
    public interface MusicGameActivityDetailInfoOrBuilder extends MessageOrBuilder
    {
        List<MusicBriefInfoOuterClass.MusicBriefInfo> getOthersCustomBeatmapList();
        
        MusicBriefInfoOuterClass.MusicBriefInfo getOthersCustomBeatmap(final int p0);
        
        int getOthersCustomBeatmapCount();
        
        List<? extends MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> getOthersCustomBeatmapOrBuilderList();
        
        MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getOthersCustomBeatmapOrBuilder(final int p0);
        
        List<MusicBriefInfoOuterClass.MusicBriefInfo> getPersonCustomBeatmapList();
        
        MusicBriefInfoOuterClass.MusicBriefInfo getPersonCustomBeatmap(final int p0);
        
        int getPersonCustomBeatmapCount();
        
        List<? extends MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> getPersonCustomBeatmapOrBuilderList();
        
        MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getPersonCustomBeatmapOrBuilder(final int p0);
        
        int getMusicGameRecordMapCount();
        
        boolean containsMusicGameRecordMap(final int p0);
        
        @Deprecated
        Map<Integer, MusicGameRecordOuterClass.MusicGameRecord> getMusicGameRecordMap();
        
        Map<Integer, MusicGameRecordOuterClass.MusicGameRecord> getMusicGameRecordMapMap();
        
        MusicGameRecordOuterClass.MusicGameRecord getMusicGameRecordMapOrDefault(final int p0, final MusicGameRecordOuterClass.MusicGameRecord p1);
        
        MusicGameRecordOuterClass.MusicGameRecord getMusicGameRecordMapOrThrow(final int p0);
    }
}
